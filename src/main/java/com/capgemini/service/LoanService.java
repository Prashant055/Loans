package com.capgemini.service;

import java.util.List;

import com.capgemini.entities.Loan;

public interface LoanService {
	public Loan addLoan(Loan loan);
	
	public List<Loan> getLoan();
	
	public boolean updateLoan(long id);
	
	public void deleteById(long id);
	
}	
