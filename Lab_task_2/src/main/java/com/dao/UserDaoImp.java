package com.dao;

import com.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    private final SessionFactory sessionFactory;

    public UserDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        Query<User> userQuery = session.createQuery("From User", User.class);
        List<User> users = userQuery.getResultList();
        return users == null ? new ArrayList<User>() : users;
    }

    @Override
    public void save(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    public User get(String id, String password) {
        Session session = this.sessionFactory.getCurrentSession();
        Query<User> userQuery = session.createQuery("From User Where id = :id AND password = :password", User.class);
        userQuery.setParameter("id", id);
        userQuery.setParameter("password", password);
        return userQuery.getSingleResult();
    }
    @Override
    public User get(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public void update(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public void delete(int id) {
        User user = get(id);
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public List<User> getAll(String name) {
        Session session = sessionFactory.getCurrentSession();
        Query<User> userQuery = session.createQuery("from User where firstName like '%" + name + "%'", User.class);
        return userQuery.getResultList();
    }
}