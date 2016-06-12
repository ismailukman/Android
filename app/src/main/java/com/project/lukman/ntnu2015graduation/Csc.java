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

public class Csc extends Activity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csc);

        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Csc.this, MainMenu.class);
                startActivity(i);
                Csc.this.finish();
                //Front.audio.stop();
            }
        });
    }



}
