package com.project.lukman.ntnu2015graduation;

import android.app.Activity;
import android.content.Intent;
//import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainMenu extends Activity {
   // static MediaPlayer audio;
    Button bus,chem,csc,eng,eee,econ,pol,credits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        bus = (Button) findViewById(R.id.button2);
        chem = (Button) findViewById(R.id.button3);
        csc = (Button) findViewById(R.id.button4);
        econ = (Button) findViewById(R.id.button5);
        eee = (Button) findViewById(R.id.button6);
        eng = (Button) findViewById(R.id.button7);
        pol = (Button) findViewById(R.id.button8);
        credits = (Button) findViewById(R.id.button9);

        //audio = MediaPlayer.create(this, R.raw.gradaudio);
        //audio.start();
       // audio.setLooping(true);


        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Buss.class);
                startActivity(i);
                MainMenu.this.finish();
            }
        });

        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, chem.class);
                startActivity(i);
                MainMenu.this.finish();
            }
        });

        csc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Csc.class);
                startActivity(i);
                MainMenu.this.finish();
            }
        });

        econ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Econs.class);
                startActivity(i);
                MainMenu.this.finish();
            }
        });

        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Eee.class);
                startActivity(i);
                MainMenu.this.finish();
            }
        });

        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Eng.class);
                startActivity(i);
                MainMenu.this.finish();
            }
        });

        pol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, pol.class);
                startActivity(i);
                MainMenu.this.finish();
            }
        });

        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Credits.class);
                startActivity(i);
                MainMenu.this.finish();
            }
        });
    }

}
