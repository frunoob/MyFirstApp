package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

//        getWindow().setBackgroundDrawableResource(R.drawable.balloons);

        // 获取启动该类的Intent并获取其携带的值
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // 将布局中textView组件进行赋值
        TextView textView =findViewById(R.id.textView);
        textView.setText(message);
        System.out.println(R.string.app_name);
    }
}