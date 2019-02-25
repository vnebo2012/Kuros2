package com.dastory.fermer.free.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class PrivestvieActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privet);

        Animation anim1 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.scale2);
        final TextView textView1 = (TextView) findViewById(R.id.textView40);

        textView1.startAnimation(anim1);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(PrivestvieActivity.this, StartActivity.class);
                startActivity(i);
                finish();
            }
        }, 2*500);
    }




    @Override
    public void onBackPressed() {
        // do something on back.

        android.os.Process.killProcess(android.os.Process.myPid());
    }


}
