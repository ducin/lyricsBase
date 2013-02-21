package com.blogspot.symfonyworld.lyricsbase.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.blogspot.symfonyworld.lyricsbase.model.Song;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class SongDaoImpl implements SongDao {

    @Autowired
    private SessionFactory sessionFactory;
         
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Song song) {
        Session session = sessionFactory.getCurrentSession();
        session.save(song);
        session.close();
    }

    @Override
    public void update(Song song) {
        Session session = sessionFactory.getCurrentSession();
        session.save(song);
        session.close();
    }

    @Override
    public void delete(Song song) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(song);
        session.close();
    }

    @Override
    public List findAllSongs() {
        return sessionFactory.getCurrentSession().createQuery(
                "FROM Song").list(); 
    }

    @Override
    public Song findBySongId(Long id) {
        return (Song) sessionFactory.getCurrentSession().get(
                Song.class, new Long(id));
    }

    @Override
    public Song findBySongTitle(String title) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                "SELECT s FROM Song s WHERE s.title = :title");
        query.setParameter("title", title);
        return (Song) query.uniqueResult();
    }

    @Override
    public Song findBySongSlug(String slug) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                "SELECT s FROM Song s WHERE s.title = :title");
        query.setParameter("title", slug.replace('_', ' '));
        return (Song) query.uniqueResult();
    }
}
