package com.cl.shop.service;
//一级分类业务层

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cl.shop.dao.CategoryDao;
import com.cl.shop.model.Category;
@Transactional
public class CategoryService {
//注入CategoryDao
	private CategoryDao categoryDao;

	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}
//业务层查询所有一级分类的方法
	public List<Category> findAll() {
		return categoryDao.findAll();
	}
	
}
