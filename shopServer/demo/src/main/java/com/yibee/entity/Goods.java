package com.yibee.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the goods database table.
 * 
 */
@Entity
@Table(name="goods")
@NamedQuery(name="Goods.findAll", query="SELECT g FROM Goods g")
public class Goods implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(length=100)
	private String location;

	@Column(length=100)
	private String name;

	@Column(nullable=false)
	private float price;

	@Column(name="selling_method")
	private byte sellingMethod;

	@Column(nullable=false)
	private int status;

	@Column(name="type_code", nullable=false, length=20)
	private String typeCode;

	//bi-directional many-to-one association to Member
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="seller_id", nullable=false)
	private Member member;

	//bi-directional many-to-one association to GoodsImage
	@OneToMany(mappedBy="good")
	private List<GoodsImage> goodsImages;

	public Goods() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public byte getSellingMethod() {
		return this.sellingMethod;
	}

	public void setSellingMethod(byte sellingMethod) {
		this.sellingMethod = sellingMethod;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public List<GoodsImage> getGoodsImages() {
		return this.goodsImages;
	}

	public void setGoodsImages(List<GoodsImage> goodsImages) {
		this.goodsImages = goodsImages;
	}

	public GoodsImage addGoodsImage(GoodsImage goodsImage) {
		getGoodsImages().add(goodsImage);
		goodsImage.setGood(this);

		return goodsImage;
	}

	public GoodsImage removeGoodsImage(GoodsImage goodsImage) {
		getGoodsImages().remove(goodsImage);
		goodsImage.setGood(null);

		return goodsImage;
	}

}