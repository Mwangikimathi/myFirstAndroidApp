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

public class JkuatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jkuat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "send us an email", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","jkuat@gmail.com",
                        null));emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
                ;startActivity(Intent.createChooser(emailIntent, "Send email..."));


            }
        });

        FloatingActionButton fabphone = (FloatingActionButton) findViewById(R.id.fabphone);
        fabphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "please call us ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+2549998067890"));
                if
                        (ContextCompat.checkSelfPermission(JkuatActivity.this, Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(JkuatActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(intent);
                }

            } });
        FloatingActionButton fabmenu = (FloatingActionButton) findViewById(R.id.fabmenu);
        fabmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here is our menu ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent sendIntent = new Intent();sendIntent.setAction(Intent.ACTION_SEND);sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Hey check out my app");sendIntent.setType("text/plain");startActivity(sendIntent);

                ;}
        });

    }}
