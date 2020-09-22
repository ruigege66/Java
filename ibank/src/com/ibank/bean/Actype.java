package com.ibank.bean;

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
import javax.persistence.UniqueConstraint;

/**
 * Actype entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "actype", catalog = "ibank", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Actype implements java.io.Serializable {

	// Fields

	private Integer typeid;
	private Interest interest;
	private String name;
	private Set<Account> accounts = new HashSet<Account>(0);

	// Constructors

	/** default constructor */
	public Actype() {
	}

	/** minimal constructor */
	public Actype(Integer typeid, Interest interest, String name) {
		this.typeid = typeid;
		this.interest = interest;
		this.name = name;
	}

	/** full constructor */
	public Actype(Integer typeid, Interest interest, String name,
			Set<Account> accounts) {
		this.typeid = typeid;
		this.interest = interest;
		this.name = name;
		this.accounts = accounts;
	}

	// Property accessors
	@Id
	@Column(name = "typeid", unique = true, nullable = false)
	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "interestid", nullable = false)
	public Interest getInterest() {
		return this.interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

	@Column(name = "name", unique = true, nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "actype")
	public Set<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

}