package com.jhj.activitylifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String infom = getIntent().getStringExtra("name");
        Toast.makeText(ActivitySecond.this, infom, Toast.LENGTH_SHORT).show();
    }
}
