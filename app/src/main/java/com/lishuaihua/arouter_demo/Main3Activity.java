package com.lishuaihua.arouter_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.lishuaihua.arouter_annotation.ARouter;
import com.lishuaihua.arouter_annotation.Parameter;
import com.lishuaihua.arouter_api.ParameterManager;

@ARouter(path = "/app/Main3Activity")
public class Main3Activity extends AppCompatActivity {
    @Parameter
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        // 用到才加载 == 懒加载
        ParameterManager.getInstance().loadParameter(this);
        TextView tvName = findViewById(R.id.tv_name);
        tvName.setText("name="+name);
    }
}