package com.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.base.BaseActivity;

public class MainActivity extends BaseActivity {
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setStatusBarColor(R.color.colorPrimaryDark);//状态栏颜色
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnStart:
                Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
