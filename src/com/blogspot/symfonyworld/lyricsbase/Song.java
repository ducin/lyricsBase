package com.blogspot.symfonyworld.lyricsbase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class Song {

    private String author;
    private String title;
    private String lyrics;
    private String album;

    public Song() {
    }

    public Song(String author, String title, String album, String lyrics_path) throws IOException {
        this.author = author;
        this.title = title;
        this.album = album;
        readLyricsFromFile(lyrics_path);
    }

    public String toString() {
        return "Song:"
                + "\nauthor: " + author
                + "\ntitle: " + title
                + "\nalbum: " + album
                + "\nlyrics: " + getShortenedLyrics();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.title = lyrics;
    }

    public String getShortenedLyrics() {
        return lyrics.substring(0, 100) + "...";
    }

    private void readLyricsFromFile(String file) throws IOException {
        String filepath = file;
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }

        lyrics = stringBuilder.toString();
    }
}
