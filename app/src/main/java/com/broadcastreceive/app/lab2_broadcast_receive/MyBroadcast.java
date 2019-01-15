package com.broadcastreceive.app.lab2_broadcast_receive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {
    private static final String ACTION_ADD = "com.tunglm.appsend.ACTION_ADD";
    private static final String KEY_NUM_A = "NUM_A";
    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()){
            case ACTION_ADD:
                Bundle data = intent.getExtras();
                String number = data.getString(KEY_NUM_A);
                if (number.equals("")){
                    Toast.makeText(context, "Dữ liệu trống", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(context, "Result: " + number, Toast.LENGTH_SHORT).show();
                    break;
                }
        }

    }
}
