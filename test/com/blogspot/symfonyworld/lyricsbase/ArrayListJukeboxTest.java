package com.blogspot.symfonyworld.lyricsbase;

import com.blogspot.symfonyworld.lyricsbase.bo.Jukebox;
import com.blogspot.symfonyworld.lyricsbase.bo.JukeboxImpl;
import com.blogspot.symfonyworld.lyricsbase.model.Song;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class ArrayListJukeboxTest {

    private Jukebox jukebox;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        jukebox = new JukeboxImpl();
        jukebox.setName("Metal Jukebox");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class ArrayListJukebox.
     */
    @Test
    public void testGetName() {
        assertEquals("Metal Jukebox", jukebox.getName());
    }

    /**
     * Test of getSongs method, of class ArrayListJukebox.
     */
    @Test
    public void testGetSongs() {
        List songs = jukebox.getAllSongs();
        assertNotNull(songs);
        assertEquals(5, songs.size());
    }

    /**
     * Test of getSong method, of class ArrayListJukebox.
     */
    @Test
    public void testGetSong() {
        Song song = jukebox.getSongByTitle("Until it sleeps");
        assertNotNull(song);
        assertEquals("Metallica", song.getAuthor());
    }

    /**
     * Test of deleteSong method, of class ArrayListJukebox.
     */
    @Test
    public void testDeleteSong() {
        assertEquals(5, jukebox.getAllSongs().size());
        Song song = jukebox.getSongByTitle("Falling away from me");
        jukebox.deleteSong(song);
        assertEquals(4, jukebox.getAllSongs().size());
    }
}
