package com.example.yuhang.calendar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Button( View v){
        Intent intent = new Intent(this,Setting.class); // 開く画面を指定
        startActivity(intent);                          //  画面を開く
    }
}

//Android StudioにあるCalendarViewを使ってカレンダーを作りました。