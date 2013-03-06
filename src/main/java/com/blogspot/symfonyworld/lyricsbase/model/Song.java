package com.blogspot.symfonyworld.lyricsbase.model;

import java.io.Serializable;
import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
@Entity
@Table(name="lyric")
public class Song implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "author")
    private String author;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "lyric_text")
    private String lyrics;
    
    @Column(name = "album")
    private String album;

    public Song() {
    }

    public Song(Long id, String author, String title, String album, String lyrics) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.album = album;
        this.lyrics = lyrics;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString() {
        return "Song:"
                + "\nauthor: " + getAuthor()
                + "\ntitle: " + getTitle()
                + "\nalbum: " + getAlbum()
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

    public String getSlug() {
        return this.getTitle().replace(' ', '_');
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
        this.lyrics = lyrics;
    }

    public String getShortenedLyrics() {
        return lyrics.substring(0, 100) + "...";
    }
}
