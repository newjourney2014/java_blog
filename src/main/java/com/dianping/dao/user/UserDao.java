package com.dianping.dao.user;

import com.dianping.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * Created by chenchen on 14-10-28.
 */
public interface UserDao {
    public UserEntity getUserById(int id);
}
