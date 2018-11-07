package com.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.dao.UserDao;
import com.gym.bean.User;


@Service
public class UserServiceImpl implements UserService {
	@Autowired  
    private UserDao userDao;  
  
    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }

	public void regist(User user) {
		userDao.addUser(user);		
	}

	public User login(String name, String password) {
		User user = userDao.findByUsername(name);
        if(user != null && user.getUserPassword().equals(password)){
        
            return user;
        }
        return null;
	} 
}
