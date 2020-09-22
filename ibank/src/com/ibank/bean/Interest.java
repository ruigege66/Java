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

/**
 * Interest entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "interest", catalog = "ibank")
public class Interest implements java.io.Serializable {

	// Fields

	private Integer interestid;
	private String name;
	private Double value;
	private Set<Loan> loans = new HashSet<Loan>(0);
	private Set<Overdraft> overdrafts = new HashSet<Overdraft>(0);
	private Set<Actype> actypes = new HashSet<Actype>(0);

	// Constructors

	/** default constructor */
	public Interest() {
	}

	/** minimal constructor */
	public Interest(Integer interestid, String name, Double value) {
		this.interestid = interestid;
		this.name = name;
		this.value = value;
	}

	/** full constructor */
	public Interest(Integer interestid, String name, Double value,
			Set<Loan> loans, Set<Overdraft> overdrafts, Set<Actype> actypes) {
		this.interestid = interestid;
		this.name = name;
		this.value = value;
		this.loans = loans;
		this.overdrafts = overdrafts;
		this.actypes = actypes;
	}

	// Property accessors
	@Id
	@Column(name = "interestid", unique = true, nullable = false)
	public Integer getInterestid() {
		return this.interestid;
	}

	public void setInterestid(Integer interestid) {
		this.interestid = interestid;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "value", nullable = false, precision = 5, scale = 4)
	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "interest")
	public Set<Loan> getLoans() {
		return this.loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "interest")
	public Set<Overdraft> getOverdrafts() {
		return this.overdrafts;
	}

	public void setOverdrafts(Set<Overdraft> overdrafts) {
		this.overdrafts = overdrafts;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "interest")
	public Set<Actype> getActypes() {
		return this.actypes;
	}

	public void setActypes(Set<Actype> actypes) {
		this.actypes = actypes;
	}

}