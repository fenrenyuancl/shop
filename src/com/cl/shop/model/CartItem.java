package com.cl.shop.model;
//购物项（购物车中的每一个商品）
public class CartItem {
	private Product product;		//购买的商品信息
	private Integer count;			//购买的某种商品的数量
	private Double subtotal;		//购物车的总金额
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Double getSubtotal() {
		return count*(double)product.getUnitcost();
	}
	
}
