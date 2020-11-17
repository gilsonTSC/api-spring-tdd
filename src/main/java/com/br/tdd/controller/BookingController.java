package com.br.tdd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.tdd.model.BookingModel;

@Controller
@RequestMapping("/bookings")
public class BookingController {

	@GetMapping
	@ResponseBody
	public String getAll() {
		return "ok";
	}
	
	@PostMapping
	public ResponseEntity<BookingModel> save(@RequestBody BookingModel bookingModel) {
		System.out.println(bookingModel.toString());
		return ResponseEntity.ok(bookingModel);
	}
	
}