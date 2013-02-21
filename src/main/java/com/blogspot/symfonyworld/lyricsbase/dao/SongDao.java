package com.blogspot.symfonyworld.lyricsbase.dao;

import java.util.List;

import com.blogspot.symfonyworld.lyricsbase.model.Song;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public interface SongDao {

    void save(Song song);

    void update(Song song);

    void delete(Song song);

    List findAllSongs();

    Song findBySongId(Long id);

    Song findBySongTitle(String title);

    Song findBySongSlug(String title);
}
