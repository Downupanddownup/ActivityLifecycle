package com.example.hopjs.activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
/*目的：了解Activity的生命周期
* 操作：开启程序，点击按钮，点击返回
* 结果：
* 02-27 20:20:17.375 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity:onCreate,ThreadId:16400
02-27 20:20:18.207 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity:onStart,ThreadId:16400
02-27 20:20:18.210 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity:onResume,ThreadId:16400
02-27 20:20:21.816 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity:onPause,ThreadId:16400
02-27 20:20:21.875 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity222:onCreate,ThreadId:16400
02-27 20:20:21.876 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity222:onStart,ThreadId:16400
02-27 20:20:21.876 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity222:onResume,ThreadId:16400
02-27 20:20:22.371 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity:onSaveInstanceState,ThreadId:16400
02-27 20:20:22.371 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity:onStop,ThreadId:16400
02-27 20:20:38.572 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity222:onPause,ThreadId:16400
02-27 20:20:38.579 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity:onRestart,ThreadId:16400
02-27 20:20:38.580 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity:onStart,ThreadId:16400
02-27 20:20:38.581 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity:onResume,ThreadId:16400
02-27 20:20:38.923 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity222:onStop,ThreadId:16400
02-27 20:20:38.923 16400-16400/com.example.hopjs.activity I/MainActivityTTTT: MainActivity222:onDestroy,ThreadId:16400*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMessage("onCreate");
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        showMessage("onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        showMessage("onRestoreInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showMessage("onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showMessage("onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showMessage("onDestroy");
    }

    private void showMessage(String msg){
        Log.i("MainActivityTTTT","MainActivity:"+msg+",ThreadId:"+android.os.Process.myTid());
    }



    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        int state = newConfig.orientation;
/*        switch (state){
            case Configuration.ORIENTATION_LANDSCAPE:
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                break;
            case Configuration.ORIENTATION_PORTRAIT:
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                break;
            default:
        }*/
    }
}
