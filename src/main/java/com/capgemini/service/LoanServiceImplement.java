package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entities.Loan;
import com.capgemini.repository.LoanRepository;


@Service
public class LoanServiceImplement implements LoanService {
	
	@Autowired
	private LoanRepository loanRepository;

	@Override
	public Loan addLoan(Loan loan) {
		// TODO Auto-generated method stub
		loanRepository.save(loan);
		return loan;
	}

	@Override
	public List<Loan> getLoan() {
		// TODO Auto-generated method stub
		return loanRepository.findAll();
	}

	@Override
	public boolean updateLoan(long id) {
		// TODO Auto-generated method stub
	    loanRepository.save(id);
		return true;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		loanRepository.deleteById(id);
	}

	

}
