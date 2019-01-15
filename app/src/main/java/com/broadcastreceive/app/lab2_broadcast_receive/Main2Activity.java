package com.broadcastreceive.app.lab2_broadcast_receive;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (ContextCompat.checkSelfPermission(Main2Activity.this,Manifest.permission.READ_PHONE_STATE)!= PackageManager.PERMISSION_GRANTED){
            if (ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,Manifest.permission.READ_PHONE_STATE)){
                ActivityCompat.requestPermissions(Main2Activity.this,new  String[]{Manifest.permission.READ_PHONE_STATE},1);
            }else {
                ActivityCompat.requestPermissions(Main2Activity.this,new String[]{Manifest.permission.READ_PHONE_STATE},1);
            }
        }else {

        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 1:{
                if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    if (ContextCompat.checkSelfPermission(Main2Activity.this,
                            Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(this, "Permision granted", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(this, "No permission granted", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }
}