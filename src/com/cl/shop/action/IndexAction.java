package com.cl.shop.action;

import java.util.List;

import com.cl.shop.model.Category;
import com.cl.shop.model.Product;
import com.cl.shop.service.CategoryService;
import com.cl.shop.service.ProductService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 首页访问的Action
 * @author 传智.郭嘉
 *
 */
public class IndexAction extends ActionSupport{
	
//通过Index查询一级分类
//注入一级分类service
	private CategoryService categoryService;
	
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
//注入商品的Service
	private ProductService productService;
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	/**
	 * 执行的访问首页的方法:
	 */
	public String execute(){	
		//调用CategoryService中的查询一级分类的方法
		//查询所有一级分类的集合
		List<Category> cList = categoryService.findAll();
		//将一级分类存入到Session的范围
		ActionContext.getContext().getSession().put("cList", cList);
		//查询热门商品
		List<Product> hList = productService.findHot();
		//保存到值栈
		ActionContext.getContext().getValueStack().set("hList", hList);
		//查询最新商品
		List<Product> nList = productService.findNew();
		//保存到值栈
		ActionContext.getContext().getValueStack().set("nList", nList);
		return "index";
	}
	
	
}
