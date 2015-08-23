package com.test.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import org.w3c.dom.Text;

/**
 * Created by wyz on 15-8-23.
 */
public class New_layout extends Activity {

    private TextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);

        Intent intent = getIntent();

        String usr = intent.getStringExtra("usr");
        String pwd = intent.getStringExtra("pwd");
        String eml = intent.getStringExtra("eml");

        temp = (TextView)findViewById(R.id.show_user);
        temp.append(usr);

        temp = (TextView)findViewById(R.id.show_password);
        temp.append(pwd);

        temp = (TextView)findViewById(R.id.show_email);
        temp.append(eml);

    }
}
