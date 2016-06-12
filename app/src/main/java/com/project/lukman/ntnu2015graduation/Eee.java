package com.project.lukman.ntnu2015graduation;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.project.lukman.ntnu2015graduation.R;

public class Eee extends Activity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Eee.this, MainMenu.class);
                startActivity(i);
                Eee.this.finish();
                //Front.audio.stop();
            }
        });

    }



}
