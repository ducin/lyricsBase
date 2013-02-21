package com.blogspot.symfonyworld.lyricsbase.bo;

import java.util.List;

import com.blogspot.symfonyworld.lyricsbase.model.Song;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public interface Jukebox {

    String getName();
    void setName(String name);

    List getAllSongs();
    Song getSongById(Long id);
    Song getSongByTitle(String title);
    Song getSongBySlug(String slug);

    void saveSong(Song song);
    void updateSong(Song song);
    void deleteSong(Song song);
}
