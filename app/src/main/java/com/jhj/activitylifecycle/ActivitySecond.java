package com.jhj.activitylifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {
    private  TextView textview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activtiy);
        String inform = getIntent().getStringExtra(MainActivity.NAME_INFO);
        TextView textview = (TextView) findViewById(R.id.second_activity_textview);
        textview.setText(inform);
    }
}
