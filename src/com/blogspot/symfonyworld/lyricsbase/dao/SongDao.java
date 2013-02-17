package com.blogspot.symfonyworld.lyricsbase.dao;

import com.blogspot.symfonyworld.lyricsbase.model.Song;
import java.util.List;

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
