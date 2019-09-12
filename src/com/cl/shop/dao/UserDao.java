package com.cl.shop.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cl.shop.model.User;

//用户模块持久层代码
public class UserDao extends HibernateDaoSupport{
//按名称查询是否有该用户
	public User findByUsername(String username) {
		String hql = "from User where username = ?";
		List<User> list = this.getHibernateTemplate().find(hql, username);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
//注册用户存入数据库代码
	public void save(User user) {
		this.getHibernateTemplate().save(user);	
	}
//用户登陆的方法
	public User login(User user) {
		String hql = "from User where username = ? and password = ?";
		List<User> list = this.getHibernateTemplate().find(hql, user.getUsername(),user.getPassword());
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
}
