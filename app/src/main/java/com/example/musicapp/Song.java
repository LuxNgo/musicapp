package com.example.musicapp;
public class Song {
    private String title;
    private String artist;
    private int imageResId;

    public Song(String title, String artist, int imageResId) {
        this.title = title;
        this.artist = artist;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getImageResId() {
        return imageResId;
    }
}
