package com.demo.mongo.bean;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("expense")
@Data @NoArgsConstructor @AllArgsConstructor
public class Expense {
	@Id
	private String id;
	@Field(value = "name")
	@Indexed(unique = true)
	private String expenseName;
	@Field(name = "Category")
	private ExpenseCategory expenseCategory;
	@Field(name = "Amount")
	private BigDecimal expenseAmount;
	
}
