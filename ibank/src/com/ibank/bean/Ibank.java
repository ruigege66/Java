package com.ibank.bean;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Ibank entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ibank", catalog = "ibank", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Ibank implements java.io.Serializable {

	// Fields

	private Integer ibankid;
	private String name;
	private Set<Account> accounts = new HashSet<Account>(0);
	private Set<Admin> admins = new HashSet<Admin>(0);

	// Constructors

	/** default constructor */
	public Ibank() {
	}

	/** minimal constructor */
	public Ibank(Integer ibankid, String name) {
		this.ibankid = ibankid;
		this.name = name;
	}

	/** full constructor */
	public Ibank(Integer ibankid, String name, Set<Account> accounts,
			Set<Admin> admins) {
		this.ibankid = ibankid;
		this.name = name;
		this.accounts = accounts;
		this.admins = admins;
	}

	// Property accessors
	@Id
	@Column(name = "ibankid", unique = true, nullable = false)
	public Integer getIbankid() {
		return this.ibankid;
	}

	public void setIbankid(Integer ibankid) {
		this.ibankid = ibankid;
	}

	@Column(name = "name", unique = true, nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ibank")
	public Set<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ibank")
	public Set<Admin> getAdmins() {
		return this.admins;
	}

	public void setAdmins(Set<Admin> admins) {
		this.admins = admins;
	}

}