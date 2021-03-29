package com.lhz.xmllayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = findViewById(R.id.bt_login);
        EditText name = findViewById(R.id.et_name);
        EditText pwd = findViewById(R.id.et_pwd);
        bt.setOnClickListener(v -> {
            String etName = name.getText().toString();
            String etPwd = name.getText().toString();
            if (etName.equals("ls") && etPwd.equals("666")) {
                Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, "用户名或密码错误", Toast.LENGTH_LONG).show();
            }
        });

    }
}