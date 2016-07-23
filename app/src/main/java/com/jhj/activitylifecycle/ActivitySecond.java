package com.jhj.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {
    private  TextView mtextview;
    private Button mSendBackButton;
    private EditText mNameEditText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activtiy);
        String inform = getIntent().getStringExtra(MainActivity.NAME_INFO);
        mtextview = (TextView) findViewById(R.id.second_activity_textview);
        mtextview.setText(inform);
        mSendBackButton = (Button) findViewById(R.id.second_activity_button);
        mNameEditText = (EditText) findViewById(R.id.second_activity_edittext);

        mSendBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=mNameEditText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("back",name);
                setResult(RESULT_OK,intent);
                finish();
            }
        });


    }
}
