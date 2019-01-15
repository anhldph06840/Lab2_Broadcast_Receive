package com.broadcastreceive.app.lab2_broadcast_receive;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bai2 extends AppCompatActivity  implements View.OnClickListener {
    private static final String ACTION_ADD = "com.tunglm.appsend.ACTION_ADD";
    private static final String KEY_NUM_A = "NUM_A";
    EditText edtThongtin;


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        initView();
    }

    private void initView() {
        edtThongtin = findViewById(R.id.edtThongtin);
        Button btnSendToBroadcast = findViewById(R.id.btnSendToBroadcast);
        btnSendToBroadcast.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSendToBroadcast:
                sendBroadCastAdd();
                break;
        }
    }

    private void sendBroadCastAdd() {
        Intent intent = new Intent(Bai2.this, MyBroadcast.class);
        intent.setAction(ACTION_ADD);
        Bundle bundle = new Bundle();
        bundle.putString(KEY_NUM_A, edtThongtin.getText().toString());
        intent.putExtras(bundle);
        sendBroadcast(intent);
    }
}
