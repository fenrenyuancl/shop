package com.cl.shop.model;

import java.util.Date;

//商品的实体对象
public class Product {
	private Integer pid;					/* 商品Id */
	private String category;			/* 商品类别 */
	private String cname;				/* 商品中文名 */
	private String ename;				/* 商品中文名 */
	private Integer is_hot;				/*是否为最热门*/
	private String image;				/* 商品图片 */
	private String descn;				/* 商品描述 */
	private String listprice;			/* 商品市场价 */
	private Date pdate;					/* 商品加入时间 */
	private Integer unitcost;			/* 商品单价 */
	private Integer cid;				/*一级分类的主键*/
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getIs_hot() {
		return is_hot;
	}
	public void setIs_hot(Integer is_hot) {
		this.is_hot = is_hot;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescn() {
		return descn;
	}
	public void setDescn(String descn) {
		this.descn = descn;
	}
	public String getListprice() {
		return listprice;
	}
	public void setListprice(String listprice) {
		this.listprice = listprice;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public Integer getUnitcost() {
		return unitcost;
	}
	public void setUnitcost(Integer unitcost) {
		this.unitcost = unitcost;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	
}
