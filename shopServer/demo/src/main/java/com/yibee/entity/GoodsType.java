package com.yibee.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the goods_types database table.
 * 
 */
@Entity
@Table(name="goods_types")
@NamedQuery(name="GoodsType.findAll", query="SELECT g FROM GoodsType g")
public class GoodsType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="category_code", length=20)
	private String categoryCode;

	@Column(name="category_name")
	private int categoryName;

	@Column(nullable=false, length=20)
	private String code;

	@Column(length=255)
	private String description;

	@Column(nullable=false, length=32)
	private String name;

	public GoodsType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public int getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(int categoryName) {
		this.categoryName = categoryName;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}