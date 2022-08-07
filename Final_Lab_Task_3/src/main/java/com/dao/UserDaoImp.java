package com.dao;

import com.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao {

    private final SessionFactory sessionFactory;

    public UserDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        Session session = this.sessionFactory.getCurrentSession();
        Query<User> userQuery = session.createQuery("From User Where user_name = :user_name AND password = :password", User.class);
        userQuery.setParameter("user_name", username);
        userQuery.setParameter("password", password);
        try {
            userQuery.getSingleResult();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
