package com.blogspot.symfonyworld.lyricsbase.bo;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.blogspot.symfonyworld.lyricsbase.dao.SongDao;
import com.blogspot.symfonyworld.lyricsbase.model.Song;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
@Transactional
public class JukeboxImpl implements Jukebox {

    SongDao songDao;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Jukebox: " + name;
    }

    public void setSongDao(SongDao songDao) {
        this.songDao = songDao;
    }

    @Override
    public List getAllSongs() {
        return songDao.findAllSongs();
    }

    @Override
    public Song getSongById(Long id) {
        return songDao.findBySongId(id);
    }

    @Override
    public Song getSongByTitle(String title) {
        return songDao.findBySongTitle(title);
    }

    @Override
    public Song getSongBySlug(String slug) {
        return songDao.findBySongSlug(slug);
    }

    @Override
    public void saveSong(Song song) {
        if (song != null) {
            songDao.save(song);
        }
    }

    @Override
    public void updateSong(Song song) {
        if (song != null) {
            songDao.update(song);
        }
    }

    @Override
    public void deleteSong(Song song) {
        songDao.delete(song);
    }
}
