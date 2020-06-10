package com.yibee.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the goods_images database table.
 * 
 */
@Entity
@Table(name="goods_images")
@NamedQuery(name="GoodsImage.findAll", query="SELECT g FROM GoodsImage g")
public class GoodsImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="image_path", length=255)
	private String imagePath;

	//bi-directional many-to-one association to Goods
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="goods_id", nullable=false)
	private Goods good;

	public GoodsImage() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Goods getGood() {
		return this.good;
	}

	public void setGood(Goods good) {
		this.good = good;
	}

}