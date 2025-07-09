package com.expensetrackerweb.expensetracker.repository;

import com.expensetrackerweb.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long>{

}
