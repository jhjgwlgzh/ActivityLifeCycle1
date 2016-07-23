package com.jhj.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: 执行！");
        Button button = (Button) findViewById(R.id.activity_main_button);
        final EditText editText = (EditText) findViewById(R.id.activity_main_editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
                intent.putExtra("name", editText.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 执行！");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume:执行！ ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 执行！");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 执行！");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 执行！");
    }
}
