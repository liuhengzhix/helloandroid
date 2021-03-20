package com.lhz.xmllayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到按钮
        Button bt = findViewById(R.id.bt_login);
        //添加点击事件
        bt.setOnClickListener(v -> Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_LONG).show());
    }
}