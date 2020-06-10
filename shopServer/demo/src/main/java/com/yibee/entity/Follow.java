package com.yibee.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the follow database table.
 * 
 */
@Entity
@Table(name="follow")
@NamedQuery(name="Follow.findAll", query="SELECT f FROM Follow f")
public class Follow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="from_id")
	private Long fromId;

	@Column(name="from_name", length=32)
	private String fromName;

	@Column(name="to_id")
	private Long toId;

	@Column(name="to_name", length=32)
	private String toName;

	public Follow() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFromId() {
		return this.fromId;
	}

	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}

	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public Long getToId() {
		return this.toId;
	}

	public void setToId(Long toId) {
		this.toId = toId;
	}

	public String getToName() {
		return this.toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

}