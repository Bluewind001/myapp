package com.test.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Created by wyz on 15-8-30.
 */
public class AActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("This is A activity!!");
        tv.setGravity(Gravity.CENTER);
        setContentView(tv);

    }
}
