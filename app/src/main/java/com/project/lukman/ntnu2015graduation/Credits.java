package com.project.lukman.ntnu2015graduation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;


public class Credits extends Activity {
    ScrollView myscrollView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        myscrollView = (ScrollView) findViewById(R.id.scrollview);
        sendScroll();
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Credits.this, MainMenu.class);
                startActivity(i);
                Credits.this.finish();
                //Front.audio.stop();
            }
        });

    }

    private void sendScroll(){
        final Handler handler = new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {Thread.sleep(2000);} catch (InterruptedException e) {}
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        myscrollView.fullScroll(View.FOCUS_DOWN);
                    }
                });
            }
        }).start();
    }
}
