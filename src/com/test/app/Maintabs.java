package com.test.app;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TabHost;
import android.widget.Toast;

/**
 * Created by wyz on 15-8-30.
 */
public class Maintabs extends TabActivity implements CompoundButton.OnCheckedChangeListener {


    private TabHost mTabHost;
    private Intent mAIntent;
    private Intent mBIntent;
    private Intent mCIntent;
    private Intent mDIntent;
    private Intent mEIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintabs);

        this.mAIntent = new Intent(this, AActivity.class);
        this.mBIntent = new Intent(this, BActivity.class);
        this.mCIntent = new Intent(this, CActivity.class);
        this.mDIntent = new Intent(this, DActivity.class);
        this.mEIntent = new Intent(this, EActivity.class);

        ((RadioButton) findViewById(R.id.radio_button0))
                .setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.radio_button1))
                .setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.radio_button2))
                .setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.radio_button3))
                .setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.radio_button4))
                .setOnCheckedChangeListener(this);

        setupIntent();

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {

            switch (buttonView.getId()) {
                case R.id.radio_button0:
                    this.mTabHost.setCurrentTabByTag("A_TAB");
                    break;
                case R.id.radio_button1:
                    this.mTabHost.setCurrentTabByTag("B_TAB");
                    break;
                case R.id.radio_button2:
                    this.mTabHost.setCurrentTabByTag("C_TAB");
                    break;
                case R.id.radio_button3:
                    this.mTabHost.setCurrentTabByTag("D_TAB");
                    break;
                case R.id.radio_button4:
                    this.mTabHost.setCurrentTabByTag("E_TAB");
                    break;
            }
        }
    }


    private void setupIntent() {
        this.mTabHost = getTabHost();
        TabHost localTabHost = this.mTabHost;

        localTabHost.addTab(buildTabSpec("A_TAB", R.string.main_home, R.drawable.icon_1_n, this.mAIntent));
        localTabHost.addTab(buildTabSpec("B_TAB", R.string.main_news, R.drawable.icon_2_n, this.mBIntent));
        localTabHost.addTab(buildTabSpec("C_TAB", R.string.main_manage_date, R.drawable.icon_3_n, this.mCIntent));
        localTabHost.addTab(buildTabSpec("D_TAB", R.string.main_friends, R.drawable.icon_4_n, this.mDIntent));
        localTabHost.addTab(buildTabSpec("E_TAB", R.string.more, R.drawable.icon_5_n, this.mEIntent));

    }

    private TabHost.TabSpec buildTabSpec(String tab, int resLabel, int resIcon, final Intent content) {
        return this.mTabHost.newTabSpec(tab).setIndicator(getString(resLabel),
                getResources().getDrawable(resIcon)).setContent(content);
    }


}
