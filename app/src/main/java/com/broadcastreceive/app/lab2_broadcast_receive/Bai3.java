package com.broadcastreceive.app.lab2_broadcast_receive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bai3 extends AppCompatActivity implements View.OnClickListener {
    private static final String ACTION_ADD = "com.tunglm.appsend.ACTION_ADD";
    private static final String KEY_NUMBER_A = "NUM_A";
    EditText edtNhapMa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        initView();
    }

    private void initView() {
        edtNhapMa = findViewById(R.id.edtNhapMa);
        Button  btnCheck = findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCheck:
                sendBroadCastAdd();
                break;
        }
    }

    private void sendBroadCastAdd() {
        Intent intent = new Intent(Bai3.this, StringBroadcastReceiver.class);
        intent.setAction(ACTION_ADD);
        Bundle bundle = new Bundle();
        bundle.putString(KEY_NUMBER_A, edtNhapMa.getText().toString());
        intent.putExtras(bundle);
        sendBroadcast(intent);
    }
}
