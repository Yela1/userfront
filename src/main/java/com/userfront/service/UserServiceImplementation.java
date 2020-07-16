package com.userfront.service;

import com.userfront.dao.UserDao;
import com.userfront.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserDao userDao;

    public void save(User user){
        userDao.save(user);
    }

    public User findByUsername(String username){
        return userDao.findByUsername(username);
    }

    public User findByEmail(String email){
        return userDao.findByEmail(email);
    }

    public boolean checkUserExists(String username, String email){
        if(checkEmailExists(email) || checkUsernameExists(username)){
            return true;
        }
        return false;
    }

    public boolean checkUsernameExists(String username){
        if(findByUsername(username) != null){
            return true;
        }
        return false;
    }

    public boolean checkEmailExists(String email){
        if(findByEmail(email) != null){
            return true;
        }
        return false;
    }
}
