package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entities.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

	void save(long id);

}
