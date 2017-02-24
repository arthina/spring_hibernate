package com.scope.banking.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="product_tbl")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="poduct_id")
	private int productId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="actual_rate")
	private long actualRate;
	
	@Column(name="dop")
	private Date DOP;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="order_id", nullable=false)
	private Order order;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getActualRate() {
		return actualRate;
	}

	public void setActualRate(long actualRate) {
		this.actualRate = actualRate;
	}

	public Date getDOP() {
		return DOP;
	}

	public void setDOP(Date dOP) {
		DOP = dOP;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	

}
