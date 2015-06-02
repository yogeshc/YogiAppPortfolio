package com.cyogesh.yogiappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /** Called when the user touches the Spotify Streamer button */
    public void startSpotifyStreamer(View view) {
        //TODO 1:
        // Replace this code with actual project 1 aka - Spotify Streamer

        // Display a toast at bottom of screen
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.app1);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the Scores App button */
    public void startScoresApp(View view) {
        //TODO 2:
        // Replace this code with actual project 2 aka - Scores App (Super Duo)

        // Display a toast at bottom of screen
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.app2);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the Library App button */
    public void startLibraryApp(View view) {
        //TODO 3:
        // Replace this code with actual project 3 aka - Library App

        // Display a toast at bottom of screen
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.app3);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the Build It Bigger button */
    public void startBuildItBigger(View view) {
        //TODO 4:
        // Replace this code with actual project 4 aka - Build It Bigger

        // Display a toast at bottom of screen
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.app4);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the Bacon Reader button */
    public void startBaconReader(View view) {
        //TODO 5:
        // Replace this code with actual project 5 aka - Bacon Reader

        // Display a toast at bottom of screen
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.app5);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the Yogi's Capstone Project button */
    public void startYogisCapstoneProject(View view) {
        //TODO 6:
        // Replace this code with actual project 6 aka - Yogi's Capstone Project

        // Display a toast at bottom of screen
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.app6);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
