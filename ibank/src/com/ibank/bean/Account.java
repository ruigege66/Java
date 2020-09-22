package com.ibank.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "account", catalog = "ibank")
public class Account implements java.io.Serializable {

	// Fields

	private String id;
	private Actype actype;
	private Ibank ibank;
	private String name;
	private String password;
	private String identitycard;
	private String sex;
	private Double balance;
	private Double overdraft;
	private Timestamp regtime;
	private Timestamp interesttime;//最后计算利息的时间
	private Integer status;
	private Set<Overdraft> overdrafts = new HashSet<Overdraft>(0);//借贷
	private Set<Acchistory> acchistories = new HashSet<Acchistory>(0);//存取

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** minimal constructor */
	public Account(String id, Actype actype, Ibank ibank, String name,
			String password, String identitycard, String sex, Double balance,
			Double overdraft, Timestamp regtime, Integer status) {
		this.id = id;
		this.actype = actype;
		this.ibank = ibank;
		this.name = name;
		this.password = password;
		this.identitycard = identitycard;
		this.sex = sex;
		this.balance = balance;
		this.overdraft = overdraft;
		this.regtime = regtime;
		this.status = status;
	}

	/** full constructor */
	public Account(String id, Actype actype, Ibank ibank, String name,
			String password, String identitycard, String sex, Double balance,
			Double overdraft, Timestamp regtime, Timestamp interesttime,
			Integer status, Set<Overdraft> overdrafts,
			Set<Acchistory> acchistories) {
		this.id = id;
		this.actype = actype;
		this.ibank = ibank;
		this.name = name;
		this.password = password;
		this.identitycard = identitycard;
		this.sex = sex;
		this.balance = balance;
		this.overdraft = overdraft;
		this.regtime = regtime;
		this.interesttime = interesttime;
		this.status = status;
		this.overdrafts = overdrafts;
		this.acchistories = acchistories;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeid", nullable = false)
	public Actype getActype() {
		return this.actype;
	}

	public void setActype(Actype actype) {
		this.actype = actype;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ibankid", nullable = false)
	public Ibank getIbank() {
		return this.ibank;
	}

	public void setIbank(Ibank ibank) {
		this.ibank = ibank;
	}

	@Column(name = "name", nullable = false, length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", nullable = false, length = 6)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "identitycard", nullable = false, length = 20)
	public String getIdentitycard() {
		return this.identitycard;
	}

	public void setIdentitycard(String identitycard) {
		this.identitycard = identitycard;
	}

	@Column(name = "sex", nullable = false, length = 2)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "balance", nullable = false, precision = 20)
	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Column(name = "overdraft", nullable = false, precision = 10)
	public Double getOverdraft() {
		return this.overdraft;
	}

	public void setOverdraft(Double overdraft) {
		this.overdraft = overdraft;
	}

	@Column(name = "regtime", nullable = false, length = 19)
	public Timestamp getRegtime() {
		return this.regtime;
	}

	public void setRegtime(Timestamp regtime) {
		this.regtime = regtime;
	}

	@Column(name = "interesttime", length = 19)
	public Timestamp getInteresttime() {
		return this.interesttime;
	}

	public void setInteresttime(Timestamp interesttime) {
		this.interesttime = interesttime;
	}

	@Column(name = "status", nullable = false)
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Overdraft> getOverdrafts() {
		return this.overdrafts;
	}

	public void setOverdrafts(Set<Overdraft> overdrafts) {
		this.overdrafts = overdrafts;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Acchistory> getAcchistories() {
		return this.acchistories;
	}

	public void setAcchistories(Set<Acchistory> acchistories) {
		this.acchistories = acchistories;
	}

}