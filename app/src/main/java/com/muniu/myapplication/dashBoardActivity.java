package com.muniu.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class dashBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
    }

    public void jkuat(View view) {
        Intent x = new Intent(dashBoardActivity.this,JkuatActivity.class);
        startActivity(x);
    }

    public void Uon(View view) {
        Intent y = new Intent(dashBoardActivity.this,UONActivity.class);
        startActivity(y);


    }

    public void moi(View view) {
        Intent z = new Intent(dashBoardActivity.this,MoiActivity.class);
        startActivity(z);
    }


    public void jkuatphone(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511800000"));if (ContextCompat.checkSelfPermission(dashBoardActivity.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(dashBoardActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else{startActivity(intent);}

    }

    public void mpesa(View view) {
        PackageManager manager = getPackageManager();Intent intent =manager.getLaunchIntentForPackage("com.android.stk");if (intent != null)startActivity(intent);

    }

    public void sms(View view) {
        Uri uri = Uri.parse("smsto:YOUR_SMS_NUMBER");Intent intent = new Intent(Intent.ACTION_SENDTO, uri);intent.putExtra("sms_body", "The SMS text");startActivity(intent);

    }
}

