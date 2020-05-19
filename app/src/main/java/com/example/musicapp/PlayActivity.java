package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PlayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        playing();
    }

    public void playing() {
        // Get extras from Intent.
        Intent musicIntent = getIntent();

        // Set the name of music for playing.
        TextView musicTextView = findViewById(R.id.player_music);
        String musicPlaying = musicIntent.getStringExtra("music");
        musicTextView.setText(musicPlaying);

        // Set the name of composer for playing.
        TextView composerTextView = findViewById(R.id.player_composer);
        String composerForPlaying = musicIntent.getStringExtra("composer");
        composerTextView.setText(composerForPlaying);
    }
}
