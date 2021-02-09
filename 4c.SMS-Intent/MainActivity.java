package com.example.intent_sms;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtMobile;
    private EditText txtMessage;
    private Button btnSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMobile = (EditText) findViewById(R.id.mblTxt);
        txtMessage = (EditText) findViewById(R.id.msgTxt);
        btnSms = (Button) findViewById(R.id.btnSend);
        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tm = txtMobile.getText().toString();
                try {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("smsto:"+tm));
                    i.putExtra("sms_body", txtMessage.getText().toString());
                    startActivity(i);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "SMS Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}