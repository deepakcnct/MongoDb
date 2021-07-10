package com.demo.mongo.controller;

import java.util.List;

import com.demo.mongo.bean.Expense;

public interface ExpenseService {

	void addExpense(Expense expense);

	void updateExpense(Expense expense);

	Expense getExpense(String name);

	List<Expense> getAllExpenses();

	void deleteExpense(String id);
	
}
