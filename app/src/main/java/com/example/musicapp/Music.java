package com.example.musicapp;
/**
 * It contains the name of the composer and his music.
 */

public class Music {

    // The name of composer.
    private String mNameOfComposer;

    // The music.
    private String mMusic;

    public Music (String nameOfComposer, String Musicname) {
        mNameOfComposer = nameOfComposer;
        mMusic = Musicname;
    }

    // Get the name of composer.
    public String getNameOfComposer() {
        return mNameOfComposer;
    }

    // Get the name of Music.
    public String getMusic() {
        return mMusic;
    }
}