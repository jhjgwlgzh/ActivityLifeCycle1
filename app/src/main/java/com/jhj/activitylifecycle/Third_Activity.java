package com.jhj.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Third_Activity extends AppCompatActivity {
    Button mbuttonthird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);
        mbuttonthird= (Button) findViewById(R.id.activity_third_button_xx);

        mbuttonthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("back","333333333333");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
