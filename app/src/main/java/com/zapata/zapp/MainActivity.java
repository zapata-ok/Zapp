package com.zapata.zapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.zapata.zapp.algorithm.Algorithm;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // Used to load the 'zapp' library on application startup.
    static {
        System.loadLibrary("zapp");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);

    }


    /**
     * A native method that is implemented by the 'zapp' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button){
            Intent intent = new Intent(this,Algorithm.class);
            startActivity(intent);
        }

    }
}