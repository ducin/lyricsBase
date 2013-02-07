package com.blogspot.symfonyworld.lyricsbase;

import java.util.*;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public interface Jukebox {

    List getSongs();
    Song getSong(String title);

    String getName();
    void setName(String name);

    void saveSong(Song song);
    void deleteSong(Song song);

}
