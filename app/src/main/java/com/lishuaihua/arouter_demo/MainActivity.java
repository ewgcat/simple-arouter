package com.lishuaihua.arouter_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.lishuaihua.arouter_annotation.ARouter;
import com.lishuaihua.arouter_api.RouterManager;

@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void jumpMain2(View view) {
        // 使用我们自己写的路由 跳转交互
        RouterManager.getInstance()
                .build("/app/Main2Activity")
                .withString("name", "杜子腾")
                .navigation(this); // 组件和组件通信
    }

    public void jumpMain3(View view) {

        // 使用我们自己写的路由 跳转交互
        RouterManager.getInstance()
                .build("/app/Main3Activity")
                .withString("name", "史甄湘")
                .withString("sex", "男")
                .withInt("age", 99)
                .navigation(this);
    }
}
