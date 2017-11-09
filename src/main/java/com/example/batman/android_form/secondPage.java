package com.example.batman.android_form;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.batman.android_form.R;


@SuppressLint("Registered")
public class secondPage extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);
    }

    public void onClick(View view){
        if(view.getId() == R.id.buttonSecond){
            finish();
            //Intent intent = new Intent(this,MainActivity.class);
            //startActivity(intent);
        }
    }


}
