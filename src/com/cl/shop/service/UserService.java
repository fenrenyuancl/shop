package com.cl.shop.service;

import org.springframework.transaction.annotation.Transactional;

import com.cl.shop.dao.UserDao;
import com.cl.shop.model.User;
import com.cl.shop.util.UUIDUtils;

//用户模块业务层代码
@Transactional
public class UserService {
		// 注入UserDao
		private UserDao userDao;
		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}
			
		// 按用户名查询用户的方法:
		public User findByUsername(String username){
			return userDao.findByUsername(username);
		}
			

		// 业务层完成用户注册代码:
		public void save(User user) {
			// 将数据存入到数据库
			user.setState(0); // 0:代表用户未激活.  1:代表用户已经激活.
			String code = UUIDUtils.getUUID()+UUIDUtils.getUUID();
			user.setCode(code);
			userDao.save(user);
		}

		// 用户登录的方法
		public User login(User user) {
			return userDao.login(user);
		}


}
