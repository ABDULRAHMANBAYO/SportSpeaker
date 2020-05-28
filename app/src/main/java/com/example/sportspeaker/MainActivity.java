package com.example.sportspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.print.PrinterId;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imgBoxing, imgKickBoxing, imgJudo, imgKarate, imgTaekwondo, imgAikido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBoxing = findViewById(R.id.imgBoxing);
        imgAikido = findViewById(R.id.imgAikido);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgTaekwondo = findViewById(R.id.imgTaekwondo);
        imgKickBoxing = findViewById(R.id.imgKickBoxing);

        imgBoxing.setOnClickListener(this);
        imgAikido.setOnClickListener(this);
        imgJudo.setOnClickListener(this);
        imgKarate.setOnClickListener(this);
        imgTaekwondo.setOnClickListener(this);
        imgKickBoxing.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgAikido:
                playSportName(imgAikido.getTag().toString());
                break;
            case R.id.imgBoxing:
                playSportName(imgBoxing.getTag().toString());
                break;
            case R.id.imgKarate:
                playSportName(imgKarate.getTag().toString());
                break;
            case R.id.imgKickBoxing:
                playSportName(imgKickBoxing.getTag().toString());
                break;
            case R.id.imgJudo:
                playSportName(imgJudo.getTag().toString());
                break;
            case R.id.imgTaekwondo:
                playSportName(imgTaekwondo.getTag().toString());
                break;
            default:
                break;

        }

    }

    private void playSportName(String sportName) {
        MediaPlayer mp = MediaPlayer.create(this, getResources().getIdentifier(sportName, "raw", getPackageName()));
        mp.start();
    }
}
