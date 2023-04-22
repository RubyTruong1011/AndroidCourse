package com.example.mediaplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

//    Widgets
    Button forward_btn, back_btn, play_btn, stop_button;
    TextView time_txt, title_txt;
    SeekBar seekbar;

//    Media Player
    MediaPlayer mediaPlayer;

//    Handlers
    Handler handler = new Handler();

//    Variables
    double startTime = 0;
    double finalTime = 0;
    int forwardTime = 10000;
    int backwardTime = 10000;
    static int oneTimeOnly = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play_btn = findViewById(R.id.play_btn);
        stop_button = findViewById(R.id.pause_btn);
        forward_btn = findViewById(R.id.forward_btn);
        back_btn = findViewById(R.id.back_btn);

        title_txt = findViewById(R.id.song_title);
        time_txt = findViewById(R.id.time_left_text);

        seekbar = findViewById(R.id.seekBar);

//        media player
        mediaPlayer = MediaPlayer.create(this,
                    R.raw.anhNangCuaAnh
                );

        seekbar.setClickable(false);

//        Adding Functionalities for the buttons
        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayMusic();
            }

            private void PlayMusic() {
                mediaPlayer.start();

                finalTime = mediaPlayer.getDuration();
                startTime = mediaPlayer.getCurrentPosition();

                if(oneTimeOnly == 0) {
                    seekbar.setMax((int) finalTime);
                    oneTimeOnly = 1;
                }




        }

        });
    }}

