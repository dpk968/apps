package com.example.mahashivaratri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Button send_button;
    EditText send_text;
    
    MediaPlayer mySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        send_button = (Button)findViewById(R.id.send_button_id);
        send_text = (EditText)findViewById(R.id.Send_text_id);
        mySong = MediaPlayer.create(SecondActivity.this,R.raw.ms);

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = send_text.getText().toString();

                Intent intent = new Intent(getApplicationContext(),LastActivity.class);

                intent.putExtra("message_key",str);
                startActivity(intent);
                mySong.start();
            }
        });

    }

}