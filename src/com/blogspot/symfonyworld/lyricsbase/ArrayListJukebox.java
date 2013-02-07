package com.blogspot.symfonyworld.lyricsbase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class ArrayListJukebox implements Jukebox {

    private String name;
    final List songs = new ArrayList();

    public ArrayListJukebox(String name) {
        this.name = name;
        try {
            songs.add(new Song("Metallica", "Until it sleeps", "Load", "song_until_it_sleeps.txt"));
            songs.add(new Song("Korn", "Falling away from me", "Issues", "song_falling_away_from_me.txt"));
            songs.add(new Song("Dio", "Gve her the gun", "Strange Highways", "song_give_her_the_gun.txt"));
            songs.add(new Song("Deep Purple", "Perfect Strangers", "Perfect Strangers", "song_perfect_strangers.txt"));
            songs.add(new Song("Mother Love Bone", "This is Shangrila", "Apple", "song_this_is_shangrila.txt"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayListJukebox() {
        this("Metal Jukebox");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Jukebox: " + name;
    }

    @Override
    public List getSongs() {
        return songs;
    }

    @Override
    public Song getSong(String title) {
        Iterator it = songs.iterator();
        while (it.hasNext()) {
            Song song = (Song) it.next();
            if (title.equals(song.getTitle())) {
                return song;
            }
        }
        return null;
    }

    @Override
    public void saveSong(Song song) {
        if (!song.equals(null)) {
            songs.add(song);
        }
    }

    @Override
    public void deleteSong(Song song) {
        songs.remove(song);
    }
}
