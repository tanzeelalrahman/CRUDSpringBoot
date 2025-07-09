package com.expensetrackerweb.expensetracker.controller;


import java.util.List;
import com.expensetrackerweb.expensetracker.model.Expense;
import com.expensetrackerweb.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/expense")
public class ExpenseController {

	
	@Autowired
	private ExpenseRepository repo;
	
	@PostMapping("")
	public String create(@ModelAttribute Expense expense) {
		repo.save(expense);
		System.out.println("Saved:" +expense.getTitle() + " " + expense.getAmount() + " " + expense.getCategory() + " " + expense.getDate());
		return "redirect:/addexpense.html";
	}
	
	@GetMapping("")
	@ResponseBody
	public List<Expense> list(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Expense get(@PathVariable long id) {
		return repo.findById(id).orElse(null);
	}
	
	@PutMapping("/{id}")
	public Expense update(@PathVariable long ID, @RequestBody Expense expense) {
		expense.setId(ID);
		return repo.save(expense);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repo.deleteById(id);
	}
}
