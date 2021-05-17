package com.capgemini.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long loanNo;
	private String loanType;
	private Long loanAmount;
	private String loanTenure;
	private Float monthlyEmi;
	private Float annualIncome;
	
	public Long getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(Long loanNo) {
		this.loanNo = loanNo;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(String loanTenure) {
		this.loanTenure = loanTenure;
	}

	public Float getMonthlyEmi() {
		return monthlyEmi;
	}

	public void setMonthlyEmi(Float monthlyEmi) {
		this.monthlyEmi = monthlyEmi;
	}

	public Float getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Float annualIncome) {
		this.annualIncome = annualIncome;
	}

	@Override
	public String toString() {
		return "LoanDetails [loanNo=" + loanNo + ", loanType=" + loanType + ", loanAmount=" + loanAmount
				+ ", loanTenure=" + loanTenure + ", monthlyEmi=" + monthlyEmi + ", annualIncome=" + annualIncome + "]";
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(Long loanNo, String loanType, Long loanAmount, String loanTenure, Float monthlyEmi,
			Float annualIncome) {
		super();
		this.loanNo = loanNo;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
		this.monthlyEmi = monthlyEmi;
		this.annualIncome = annualIncome;
	}

	

}
