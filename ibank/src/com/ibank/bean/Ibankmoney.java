package com.ibank.bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ibankmoney entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ibankmoney", catalog = "ibank")
public class Ibankmoney implements java.io.Serializable {

	// Fields

	private Integer id;
	private Date date;
	private Double money;
	private Double lastdaymoney;

	// Constructors

	/** default constructor */
	public Ibankmoney() {
	}

	/** full constructor */
	public Ibankmoney(Integer id, Date date, Double money, Double lastdaymoney) {
		this.id = id;
		this.date = date;
		this.money = money;
		this.lastdaymoney = lastdaymoney;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "money", nullable = false, precision = 30)
	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	@Column(name = "lastdaymoney", nullable = false, precision = 30)
	public Double getLastdaymoney() {
		return this.lastdaymoney;
	}

	public void setLastdaymoney(Double lastdaymoney) {
		this.lastdaymoney = lastdaymoney;
	}

}