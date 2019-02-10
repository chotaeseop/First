package com.hfad.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton1Clicked(View v) {
        setContentView(R.layout.normal);
    }
    public void onButton2Clicked(View V) {
        setContentView(R.layout.second);
    }
}
