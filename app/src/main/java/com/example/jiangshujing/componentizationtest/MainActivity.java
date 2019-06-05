package com.example.jiangshujing.componentizationtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import com.example.jiangshujing.lib_base.TestBase;
import com.example.jiangshujing.librarya.TestA;
import com.example.jiangshujing.libraryb.TestB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestBase.set("我是 lib_base ");
        TestA.set("我是 libA");
        TestB.set("我是 libB");
//        TextView textView = findViewById(R.id.textView);
//        textView.setText(TestA.get();

        Log.e("MainActivity",TestBase.get());
        Log.e("MainActivity",TestA.get());
        Log.e("MainActivity",TestB.get());
    }
}
