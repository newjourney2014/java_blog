package com.dianping.daoimpl.user;

import com.dianping.dao.user.UserDao;
import com.dianping.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * Created by chenchen on 14-10-28.
 */
@Repository
public class UserDaoImpl implements UserDao{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public UserEntity getUserById(int id){
        Session session = this.sessionFactory.getCurrentSession();
        UserEntity userEntity = (UserEntity) session.load(UserEntity.class,new Integer(id));
        return userEntity;
    }
}
