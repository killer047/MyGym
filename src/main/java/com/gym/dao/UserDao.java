package com.gym.dao;

import org.apache.ibatis.annotations.Param;

import com.gym.bean.User;


public interface UserDao {
	public User selectUserById(Integer userId);

	// 添加用户
	public void addUser(User user);

	// 根据用户名查询用户
	// 注解的两个参数会自动封装成map集合，括号内即为键
	public User findByUsername(@Param("name") String name);
}
