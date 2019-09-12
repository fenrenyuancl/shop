package com.cl.shop.model;

import java.util.HashSet;
import java.util.Set;

//一级分类实体类对象
public class Category {
	private Integer cid;
	private String cname;
	//一级分类中存放商品类别的集合
	private Set<Product> products = new HashSet<Product>();
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
