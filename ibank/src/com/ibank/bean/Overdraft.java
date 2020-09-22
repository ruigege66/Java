package com.ibank.bean;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Overdraft entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "overdraft", catalog = "ibank")
public class Overdraft implements java.io.Serializable {

	// Fields

	private Integer id;
	private Interest interest;
	private Account account;
	private Timestamp begintime;
	private Timestamp endtime;
	private Double draftmoney;
	private Double refundmoney;
	private Integer freedays;
	private Integer status;

	// Constructors

	/** default constructor */
	public Overdraft() {
	}

	/** full constructor */
	public Overdraft(Integer id, Interest interest, Account account,
			Timestamp begintime, Timestamp endtime, Double draftmoney,
			Double refundmoney, Integer freedays, Integer status) {
		this.id = id;
		this.interest = interest;
		this.account = account;
		this.begintime = begintime;
		this.endtime = endtime;
		this.draftmoney = draftmoney;
		this.refundmoney = refundmoney;
		this.freedays = freedays;
		this.status = status;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "overinterestid", nullable = false)
	public Interest getInterest() {
		return this.interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "accid", nullable = false)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Column(name = "begintime", nullable = false, length = 19)
	public Timestamp getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Timestamp begintime) {
		this.begintime = begintime;
	}

	@Column(name = "endtime", nullable = false, length = 19)
	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	@Column(name = "draftmoney", nullable = false, precision = 10)
	public Double getDraftmoney() {
		return this.draftmoney;
	}

	public void setDraftmoney(Double draftmoney) {
		this.draftmoney = draftmoney;
	}

	@Column(name = "refundmoney", nullable = false, precision = 10)
	public Double getRefundmoney() {
		return this.refundmoney;
	}

	public void setRefundmoney(Double refundmoney) {
		this.refundmoney = refundmoney;
	}

	@Column(name = "freedays", nullable = false)
	public Integer getFreedays() {
		return this.freedays;
	}

	public void setFreedays(Integer freedays) {
		this.freedays = freedays;
	}

	@Column(name = "status", nullable = false)
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}