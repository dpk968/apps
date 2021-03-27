package com.example.mahashivaratri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    TextView receiver_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        receiver_msg = (TextView)findViewById(R.id.recevied_value_id);

        Intent intent = getIntent();

        String str = intent.getStringExtra("message_key");

        receiver_msg.setText(str);
    }
}