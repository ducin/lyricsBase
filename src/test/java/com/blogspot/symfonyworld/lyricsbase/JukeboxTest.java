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
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/dataSource.xml",
//                                   "/hibernate.xml", 
//                                   "/beans.xml"})
//@ContextConfiguration("file:src/main/webapp/WEB-INF/lyricsBaseApp-servlet.xml")
//@ContextConfiguration(locations={"/JukeboxTest-context.xml"})
//@ContextConfiguration
//@ContextConfiguration("/JukeboxTest-context.xml")
@ContextConfiguration(value = "classpath:*.xml")
public class JukeboxTest {

    @Autowired
    private ApplicationContext applicationContext;
    
    private Jukebox jukebox;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        jukebox = (Jukebox) applicationContext.getBean("metal_jukebox");
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
    /*
    @Test
    public void testInsertAndDeleteSong() {
        assertEquals(5, jukebox.getAllSongs().size());
        Song song = (Song) applicationContext.getBean("test_song");
        jukebox.saveSong(song);
        assertEquals(6, jukebox.getAllSongs().size());
        jukebox.deleteSong(song);
        assertEquals(5, jukebox.getAllSongs().size());
    }
    */
}
