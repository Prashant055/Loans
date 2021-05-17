package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Loan;
import com.capgemini.service.LoanService;

@RestController
@RequestMapping("/server/loanDetails")
public class LoanDetailsController {
	
	@Autowired
	private LoanService loanService;
	
	@PostMapping("/insert")
	public Loan addLoan(@RequestBody Loan loan){
		return this.loanService.addLoan(loan);
	}
	
	@GetMapping("/view")
	public List<Loan> getLoan() {
		return this.loanService.getLoan();
	}
	
	@PutMapping("/update/{id}")
	public boolean updateLoan(@PathVariable long id) {
		return this.loanService.updateLoan(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteById(@PathVariable long id) {
		loanService.deleteById(id);
	}
	

}
