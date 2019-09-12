package com.cl.shop.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cl.shop.model.Product;

//商品持久层代码
public class ProductDao extends HibernateDaoSupport{
//首页热门商品的查询
	public List<Product> findHot() {
		//带有分页的查询
		//使用离线条件查询
		DetachedCriteria criteria = DetachedCriteria.forClass(Product.class);
		// 查询热门的商品,条件就是is_host = 1
				criteria.add(Restrictions.eq("is_hot", 1));
				// 倒序排序输出:
				criteria.addOrder(Order.desc("pdate"));
				// 执行查询:
				List<Product> list = this.getHibernateTemplate().findByCriteria(criteria, 0, 10);
				return list;
	}
	//首页最新商品的查询
	public List<Product> findNew() {
	//带有分页的查询
			//使用离线条件查询
			DetachedCriteria criteria = DetachedCriteria.forClass(Product.class);
			// 倒序排序输出:
			criteria.addOrder(Order.desc("pdate"));
			// 执行查询:
			List<Product> list = this.getHibernateTemplate().findByCriteria(criteria, 0, 10);
			return list;
	}
	//根据商品id查询商品
	public Product findByPid(Integer integer) {
		return this.getHibernateTemplate().get(Product.class, integer);
	}

}
