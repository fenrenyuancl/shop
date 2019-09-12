package com.cl.shop.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cl.shop.model.Category;

//一级分类持久层
public class CategoryDao extends HibernateDaoSupport{
//Dao层查询所有一级分类的方法
	public List<Category> findAll() {
		String hql = "from Category";
		List<Category> list = this.getHibernateTemplate().find(hql);
		return list;
	}
	
}
