package com.project.lukman.ntnu2015graduation;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class Front extends Activity {
    private ImageView image1;
    private Animation anim;
    private CountDownTimer countDownTimer;
    private long totalTimeCountInMilliseconds;
    private long timeBlinkInMilliseconds;

    static MediaPlayer audio, student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_front);
        image1 = (ImageView) findViewById(R.id.imageView);
        anim = AnimationUtils.loadAnimation(this, R.anim.anim);
        audio = MediaPlayer.create(this, R.raw.gradaudio);
        audio.start();
        audio.setLooping(true);

        setTimer();
        startTimer();
    }

  /*  @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            image1.startAnimation(anim);
            setTimer();
            startTimer();
        }
    }
    */
    private void setTimer() {
        int time = 5;
        totalTimeCountInMilliseconds = time * 1000;
        timeBlinkInMilliseconds = time * 1000;
    }
    private void startTimer() {
        countDownTimer = new CountDownTimer(totalTimeCountInMilliseconds, 500) {
            // 500 means, onTick function will be called at every 500 milliseconds
            // @Override
            public void onTick(long leftTimeInMilliseconds) {
                long seconds = leftTimeInMilliseconds / 1000;
            }
            @Override
            public void onFinish() {
                // this function will be called when the timecount is finished
                Intent i = new Intent(Front.this, Front1.class);
                startActivity(i);
                //Front.this.finish();
            }
        }.start();
    }




}
