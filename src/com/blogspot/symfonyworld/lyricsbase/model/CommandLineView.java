package com.blogspot.symfonyworld.lyricsbase.model;

import com.blogspot.symfonyworld.lyricsbase.bo.Jukebox;
import java.util.Iterator;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class CommandLineView {

    private Jukebox jukebox;

    public CommandLineView() {}

    public void setJukebox(Jukebox jukebox) {
        this.jukebox = jukebox;
    }

    public Jukebox getJukebox() {
        return jukebox;
    }

    public void displayAllSongs() {
        System.out.println(jukebox.toString());
        Iterator it = jukebox.getAllSongs().iterator();
        while (it.hasNext()) {
            Song song = (Song) it.next();
            System.out.println(song.toString());
        }
    }
}
