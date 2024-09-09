package com.vtalent.web.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vtalent.web.binding.Books;

@Controller
public class BookRestController {

	/*
	 * @GetMapping("/book") public ModelAndView getBookDetails() { ModelAndView
	 * mav=new ModelAndView(); Book bookObject=new Book(5011,"Fm",4510.00);
	 * mav.addObject("book", bookObject); mav.setViewName("bookPage"); return mav; }
	 */
	@GetMapping("/book")
	public String getbooksData(Model model) {
		Books b1 = new Books(101, "Java", 855.00);
		Books b2 = new Books(112, ".Net", 700.00);
		Books b3 = new Books(103, "Python", 600.00);
		Books b4 = new Books(104, "C#", 450.00);
		List<Books> booksList = Arrays.asList(b1, b2, b3, b4);
		model.addAttribute("books", booksList);
		return "books";

	}
	Bug 124
	@GetMapping("/book")
	public String getbooksData(Model model) {
		Books b1 = new Books(101, "Java", 855.00);
		Books b2 = new Books(112, ".Net", 700.00);
		Books b3 = new Books(103, "Python", 600.00);
		Books b4 = new Books(104, "C#", 450.00);
		List<Books> booksList = Arrays.asList(b1, b2, b3, b4);
		model.addAttribute("books", booksList);
		return "books";

	}

	

}
