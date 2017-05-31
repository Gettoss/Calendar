package com.example.yuhang.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
    public void onButton( View v){
        // 文字を取り出しす
        String s = ((EditText)findViewById(R.id.et)).getText().toString();
        // 文字をTextViewにセット
        ((TextView)findViewById(R.id.tv)).setText(s);
    }
}

//指定した日に当日の予定をメモできるように作ると考えましたが、
// 締め切りが近いため中途半端なものしかできなくてすみませんでした。