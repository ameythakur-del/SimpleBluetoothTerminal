package de.kai_morich.simple_bluetooth_terminal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity1 extends AppCompatActivity {

    Timer timer;
    TextView speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
               startActivity(new Intent(MainActivity1.this, MainActivity.class));
               finish();
            }
        }, 3000);
    }
}
