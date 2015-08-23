package com.test.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private Button jump_button;

    private EditText usr;
    private EditText pwd;
    private EditText eml;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        jump_button = (Button)findViewById(R.id.submit);
        jump_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usr = (EditText)findViewById(R.id.input_username);
                pwd = (EditText)findViewById(R.id.input_password);
                eml = (EditText)findViewById(R.id.input_email);

                Intent intent = new Intent();
                intent.putExtra("usr",usr.getText().toString());
                intent.putExtra("pwd",pwd.getText().toString());
                intent.putExtra("eml",eml.getText().toString());

                intent.setClass(MyActivity.this,New_layout.class);
                startActivity(intent);
            }
        });

    }
}
