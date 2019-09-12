package com.cl.shop.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cl.shop.dao.ProductDao;
import com.cl.shop.model.Product;
//商品的业务层代码
@Transactional
public class ProductService {
//注入productDao
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
//首页热门商品的查询
	public List<Product> findHot() {
		return productDao.findHot();
	}
	//首页最新 商品的查询
	public List<Product> findNew() {
		return productDao.findNew();
	}
	//根据商品id查询商品
	public Product findByPid(Integer integer) {
		return productDao.findByPid(integer);
	}
	
}
