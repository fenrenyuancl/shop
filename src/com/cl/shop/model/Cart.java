package com.cl.shop.model;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
//购物车
public class Cart {
	//购物车属性
//购物项的集合 Map的key是pid value是购物项
	private Map<Integer, CartItem> map = new LinkedHashMap<Integer, CartItem>();
	// Cart对象中有一个叫cartItems属性.
		public Collection<CartItem> getCartItems(){
			return map.values();
		}
		
	//购物总计
	private double total;
	
	//购物车功能
	//1.将商品添加到购物车
	public void addCart(CartItem cartItem) {
		//判断购物车中是否有该商品，如果有，数量增加，小记金额增加；如果没有，向Map中添购物项，金额=金额+小记金额
		//获得商品的id
		Integer pid = cartItem.getProduct().getPid();
		//判断是否存在
		if (map.containsKey(pid)) {
			//存在
			CartItem _cartItem = map.get(pid);// 获得购物车中原来的购物项
			_cartItem.setCount(_cartItem.getCount()+cartItem.getCount());
		}else {
			//不存在
			map.put(pid, cartItem);
		}
		// 设置总计的值
		total += cartItem.getSubtotal();
	}
	public double getTotal() {
		return total;
	}

	//2.将购物项移除购物车
	public void removeCart(Integer pid) {
		//将某个购物项移除购物车，总计金额减去移除的商品的金额
		//移除商品
		CartItem cartItem = map.remove(pid);
		//总计金额减去移除的商品的金额
		total-=cartItem.getSubtotal();
	}
	//3.清空购物车 
	public void clearCart() {
		//将所有商品清空，并设置金额为0
		//清空map
		map.clear();
		//设置total=0
		total = 0;
		
	}
}
