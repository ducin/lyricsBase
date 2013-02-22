package com.blogspot.symfonyworld.lyricsbase;

import com.blogspot.symfonyworld.lyricsbase.bo.Jukebox;
import com.blogspot.symfonyworld.lyricsbase.model.Song;

import java.util.List;
import javax.annotation.Resource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:JukeboxTest-context.xml")
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class JukeboxTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Resource(name = "metalJukebox")
    private Jukebox jukebox;

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    private Session session = null;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Open session for each test.
     */
    @Before
    public void setUp() {
        session = sessionFactory.openSession();
    }

    /**
     * Close session after each test.
     */
    @After
    public void tearDown() {
        session.close();
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
     * Test of saveSong and deleteSong method, of class ArrayListJukebox.
     */
    @Test
    public void testInsertAndDeleteSong() {
        assertEquals(5, jukebox.getAllSongs().size());
        Song song = (Song) applicationContext.getBean("testSong");
        jukebox.saveSong(song);
        assertEquals(6, jukebox.getAllSongs().size());
        jukebox.deleteSong(song);
        assertEquals(5, jukebox.getAllSongs().size());
    }
}
