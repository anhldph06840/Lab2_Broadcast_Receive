package com.broadcastreceive.app.lab2_broadcast_receive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Scanner;

public class StringBroadcastReceiver extends BroadcastReceiver {
    private static final String ACTION_ADD = "com.tunglm.appsend.ACTION_ADD";
    private static final String KEY_NUM_A = "NUM_A";
    String MEM537128;
    String MEM537129;
    String VIP537128;
    String VIP537129;

    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()) {
            case ACTION_ADD:
                Bundle data = intent.getExtras();
                String number = data.getString(KEY_NUM_A);
                String MEM = "MEM";
                String VIP = "VIP";
                String A = MEM537128;
                if (number.equals("")){
                    Toast.makeText(context, "Mời bạn nhập mã", Toast.LENGTH_SHORT).show();
                }else if (number.equals(MEM)){
                    Toast.makeText(context, "Hãy nhập tiếp mã số", Toast.LENGTH_SHORT).show();
                }else if (number.equals(VIP)){
                    Toast.makeText(context, "Hãy nhập tiếp mã số", Toast.LENGTH_SHORT).show();
                }else if (number.length() > 9){
                    Toast.makeText(context, "Độ dài kí tự", Toast.LENGTH_SHORT).show();
                } else if (number.equals("MEM537128")) {
                    Toast.makeText(context, "Bạn được khuyến mại 10%", Toast.LENGTH_SHORT).show();
                } else if (number.equals("MEM537129")) {
                    Toast.makeText(context, "Bạn được khuyến mại 20%", Toast.LENGTH_SHORT).show();
                } else if (number.equals("VIP537128")) {
                    Toast.makeText(context, "Bạn được khuyến mại 30%", Toast.LENGTH_SHORT).show();
                } else if (number.equals("VIP537129")) {
                    Toast.makeText(context, "Bạn được khuyến mại 50%", Toast.LENGTH_SHORT).show();
                }else if (number.length() == 9 && number != A) {
                    Toast.makeText(context, "Bạn không được khuyến mại", Toast.LENGTH_SHORT).show();
                } else if (number!= MEM) {
                    Toast.makeText(context, "Bắt đầu bằng MEM hoặc VIP", Toast.LENGTH_SHORT).show();
                }
       }

    }
}
