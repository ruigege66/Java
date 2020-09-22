package com.ibank.bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Loan entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "loan", catalog = "ibank")
public class Loan implements java.io.Serializable {

	// Fields
	private Integer id;
	private Interest interest;
	private String name;
	private String identitycard;
	private Date begintime;
	private Date endtime;
	private Double loanmoney;
	private Double refundmoney;
	private Integer loandays;
	private Integer status;
	/** default constructor */
	public Loan() {
	}

	/** minimal constructor */
	public Loan(Integer id, Interest interest, String name,
			String identitycard, Date begintime, Date endtime,
			Double loanmoney, Double refundmoney) {
		this.id = id;
		this.interest = interest;
		this.name = name;
		this.identitycard = identitycard;
		this.begintime = begintime;
		this.endtime = endtime;
		this.loanmoney = loanmoney;
		this.refundmoney = refundmoney;
	}

	/** full constructor */
	public Loan(Integer id, Interest interest, String name,
			String identitycard, Date begintime, Date endtime,
			Double loanmoney, Double refundmoney, Integer loandays,
			Integer status) {
		this.id = id;
		this.interest = interest;
		this.name = name;
		this.identitycard = identitycard;
		this.begintime = begintime;
		this.endtime = endtime;
		this.loanmoney = loanmoney;
		this.refundmoney = refundmoney;
		this.setLoandays(loandays);
		this.status = status;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loaninterestid", nullable = false)
	public Interest getInterest() {
		return this.interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

	@Column(name = "name", nullable = false, length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "identitycard", nullable = false, length = 10)
	public String getIdentitycard() {
		return this.identitycard;
	}

	public void setIdentitycard(String identitycard) {
		this.identitycard = identitycard;
	}

	@Column(name = "begintime", nullable = false, length = 19)
	public Date getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	@Column(name = "endtime", nullable = true, length = 19)
	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	@Column(name = "loanmoney", nullable = false, precision = 10)
	public Double getLoanmoney() {
		return this.loanmoney;
	}

	public void setLoanmoney(Double loanmoney) {
		this.loanmoney = loanmoney;
	}

	@Column(name = "refundmoney", nullable = true, precision = 10)
	public Double getRefundmoney() {
		return this.refundmoney;
	}

	public void setRefundmoney(Double refundmoney) {
		this.refundmoney = refundmoney;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setLoandays(Integer loandays) {
		this.loandays = loandays;
	}

	public Integer getLoandays() {
		return loandays;
	}

}