package com.cl.shop.action;

import org.apache.struts2.ServletActionContext;

import com.cl.shop.model.Cart;
import com.cl.shop.model.CartItem;
import com.cl.shop.model.Product;
import com.cl.shop.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport{
	//接受pid
	private Integer pid;
	//接收count
	private Integer count;
	//注入商品的service
	private ProductService productService = new ProductService();
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	//将购物项添加到购物车的执行方法
	public String addCart() {
		//封装一个CartItem对象
		CartItem cartItem = new CartItem();
		//设置数量
		cartItem.setCount(count);
		//根据pid查询商品
		Product product = productService.findByPid(pid);
		//设置商品
		cartItem.setProduct(product);
		//将购物项添加到购物车
		//不能直接new cart、不然每次执行都是一个新的购物车，通过调用session获得
		Cart cart = getCart();
		cart.addCart(cartItem);
		return "addCart";
	}
	
	//清空购物车执行的方法
	public String clearCart() {
		//获得购物车对象
		Cart cart =getCart();
		//调用购物车中的清除方法
		cart.clearCart();
		return "clearCart";
	}
	
	//购物车移除购物项的方法
	public String removeCart() {
		//获得购物车对象
		Cart cart = getCart();
		//调用购物车中的移除的方法
		cart.removeCart(pid);
		return "removeCart";
	}
	//首页回到购物车的方法
	public String backCart() {
		return "backCart";
	}
//获得购物车的方法：从session中获得购物车
	private Cart getCart() {
		Cart cart = (Cart) ServletActionContext.getRequest().getSession() .getAttribute("cart");
		if (cart == null) {
			cart = new Cart();
			ServletActionContext.getRequest().getSession()
					.setAttribute("cart", cart);
		}
		return cart;
	}
//提交订单界面
	public String order() {
		return "order";
	}
}
