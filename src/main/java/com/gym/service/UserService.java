package com.gym.service;

import com.gym.bean.User;


public interface UserService {
	User selectUserById(Integer userId);

	// 用户注册
	void regist(User user);

	// 用户登录
	User login(String name, String password);
}
