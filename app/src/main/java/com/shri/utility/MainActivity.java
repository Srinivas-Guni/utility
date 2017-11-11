package com.shri.utility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shri.apputility.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.print("Hello Utility ");

    }
}
