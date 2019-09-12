package com.cl.shop.action;

import java.util.List;

import com.cl.shop.model.Category;
import com.cl.shop.model.Product;
import com.cl.shop.service.CategoryService;
import com.cl.shop.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品的Action
 * @author 疯人愿
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	//用于接收数据的模型驱动
	private Product product = new Product();
	//注入商品的Service
	private ProductService productService;
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	//接收商品的类别
	private String category;
	//注入一节分类的Service
	private CategoryService categoryService;
	
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Product getModel() {
		return product;
	}
	//根据商品id查询商品：执行方法
	public String  findByPid() {
		//调用Service的方法完成查询
		product = productService.findByPid(product.getPid());
		return "findByPid";
		
	}
	//根据商品分类查询商品：执行方法
	public String findByCategory() {
		//List<Category> productList = categoryService.findAll();
		return "findByCategory";
	}
	
	
}
