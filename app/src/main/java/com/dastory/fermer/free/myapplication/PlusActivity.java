package com.dastory.fermer.free.myapplication;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PlusActivity extends AppCompatActivity {

    EditText edittextEmailAddress;
    EditText edittextEmailSubject;
    EditText edittextEmailText;
    TextView textImagePath;
    TextView etCopy;
    ClipboardManager mClipboard;

    final int RQS_LOADIMAGE = 0;

    Uri imageUri = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);



        // mClipboard.addPrimaryClipChangedListener(mPrimaryChangeListener);

        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);

        //getSupportActionBar().setTitle(R.string.my_tb_title);




        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        //String a = "betonir1@gmail.com";
        //mWebView.loadUrl (a + " ");
        // edittextEmailAddress = (a);
        //edittextEmailAddress = (EditText) findViewById(R.id.email_address);
        edittextEmailSubject = (EditText) findViewById(R.id.email_subject);
        edittextEmailText = (EditText) findViewById(R.id.email_text);
        textImagePath = (TextView) findViewById(R.id.imagepath);

    }


    public void onEmailClick(View v) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        String emailAddress = "vnebo2012@gmail.com";
        String emailSubject = edittextEmailSubject.getText().toString();
        String emailText = edittextEmailText.getText().toString();
        String emailAddressList[] = {emailAddress};

        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra(Intent.EXTRA_EMAIL, emailAddressList);
        intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
        intent.putExtra(Intent.EXTRA_TEXT, emailText);

        if (imageUri != null) {
            intent.putExtra(Intent.EXTRA_STREAM, imageUri);
            intent.setType("image/png");
        } else {
            intent.setType("plain/text");
        }

        startActivity(Intent.createChooser(intent, "Выбрите Gmail"));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case RQS_LOADIMAGE:
                    imageUri = data.getData();
                    textImagePath.setText(imageUri.toString());
                    break;
            }
        }
    }

    @Override
    public void onBackPressed() {

        Intent a = new Intent(this, StartActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }

}
