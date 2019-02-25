package com.dastory.fermer.free.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    private TextView mTextMessage;
    final Context context2 = this;
    final String MY_SETTINGS = "saved_text_stg100011";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {




                case R.id.navigation_home11:
                    Intent intent21 = new Intent(Intent.ACTION_VIEW);
                    intent21.setData(Uri.parse("https://www.youtube.com/playlist?list=PL8TpYTB2qlTmGYyAHD5htDrfAptYUbu8P"));
                    startActivity(intent21);
                    return true;
                case R.id.navigation_dashboard:


                    final Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    String textToSend="https://play.google.com/store/apps/details?id=com.dastory.fermer.free.myapplication";
                    intent.putExtra(Intent.EXTRA_TEXT, textToSend);
                    try
                    {
                        startActivity(Intent.createChooser(intent, "Поделится приложением"));
                    }
                    catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(getApplicationContext(), "Some error", Toast.LENGTH_SHORT).show();
                    }

                    return true;
                case R.id.navigation_notifications:
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Dastory+Studio"));
                    startActivity(intent2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        boolean hasVisited = sp.getBoolean("hasVisited_stg100011", false);
        if (!hasVisited) {

            LayoutInflater li = LayoutInflater.from(context2);
            View promptsView = li.inflate(R.layout.activity_hellp2, null);
            AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
            mDialogBuilder.setView(promptsView);






            mDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {

                                }
                            });
            AlertDialog alertDialog = mDialogBuilder.create();
            alertDialog.show();


            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            // выводим нужную активность
            // напр.
            //Intent intent = new Intent(this, Main2Activity.class);
            // startActivity(intent);

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited_stg100011", true);
            e.commit(); // не забудьте подтвердить изменения
        }


        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void onClick_Br_Kombi(View view) {

        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Intent a = new Intent(this,Broiler_kombikorm_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }

    public void onClick_Ns1_Kombi(View view) {

        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Intent a = new Intent(this,Nesushka_kombikorm_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }

    public void onClick_Perepelka_mjaso(View view) {

        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Intent a = new Intent(this,Perepelka_mjaso_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }
}
