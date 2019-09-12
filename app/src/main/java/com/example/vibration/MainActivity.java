package com.example.vibration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity
    implements View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean onTouch(View v, MotionEvent event) {
        Vibrator vb =(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        if(event.getAction() == MotionEvent.ACTION_DOWN)
        {
            vb.vibrate(5000);
        }
        else if (event.getAction() == MotionEvent.ACTION_UP);
        {
            vb.cancel();
        }



        return false;
    }
}
