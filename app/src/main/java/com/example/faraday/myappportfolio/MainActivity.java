package com.example.faraday.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button spotifyStreamerBtn = null;
    Button scoresAppBtn = null;
    Button libraryBtn = null;
    Button buildItBiggerBtn = null;
    Button XYZReaderBtn = null;
    Button capsoneProjectBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        //Initializing buttons
        spotifyStreamerBtn = (Button) findViewById(R.id.spotify_app_btn);
        spotifyStreamerBtn.setOnClickListener(new Toaster(spotifyStreamerBtn.getText().toString()));

        scoresAppBtn = (Button) findViewById(R.id.scores_app_btn);
        scoresAppBtn.setOnClickListener(new Toaster(scoresAppBtn.getText().toString()));

        libraryBtn = (Button) findViewById(R.id.library_app_btn);
        libraryBtn.setOnClickListener(new Toaster(libraryBtn.getText().toString()));

        buildItBiggerBtn = (Button) findViewById(R.id.build_it_bigger_app_btn);
        buildItBiggerBtn.setOnClickListener(new Toaster(buildItBiggerBtn.getText().toString()));

        XYZReaderBtn = (Button) findViewById(R.id.xyz_app_btn);
        XYZReaderBtn.setOnClickListener(new Toaster(XYZReaderBtn.getText().toString()));

        capsoneProjectBtn = (Button) findViewById(R.id.capstone_app_btn);
        capsoneProjectBtn.setOnClickListener(new Toaster(capsoneProjectBtn.getText().toString()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
