package com.blogspot.symfonyworld.lyricsbase.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.blogspot.symfonyworld.lyricsbase.model.Song;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class SongDaoImpl implements SongDao {

    @Autowired
    private SessionFactory sessionFactory;

    Session session = null;
    Transaction tx = null;
         
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Song song) {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(song);
        tx.commit();
        session.close();
    }

    @Override
    public void update(Song song) {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(song);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(Song song) {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.delete(song);
        tx.commit();
        session.close();
    }

    @Override
    public List findAllSongs() {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List list = session.createQuery("FROM Song").list();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public Song findBySongId(Long id) {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        Song song = (Song) session.get(Song.class, new Long(id));
        tx.commit();
        session.close();
        return song;
    }

    @Override
    public Song findBySongTitle(String title) {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        Query query = session.createQuery(
                "SELECT s FROM Song s WHERE s.title = :title");
        query.setParameter("title", title);
        Song song = (Song) query.uniqueResult();
        tx.commit();
        session.close();
        return song;
    }

    @Override
    public Song findBySongSlug(String slug) {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        Query query = session.createQuery(
                "SELECT s FROM Song s WHERE s.title = :title");
        query.setParameter("title", slug.replace('_', ' '));
        Song song = (Song) query.uniqueResult();
        tx.commit();
        session.close();
        return song;
    }
}
