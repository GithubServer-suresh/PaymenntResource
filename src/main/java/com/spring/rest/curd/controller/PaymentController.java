package com.spring.rest.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.curd.dto.PaymentResponse;
import com.spring.rest.curd.model.Payment;
import com.spring.rest.curd.service.PaymentService;

@RestController
@RequestMapping("/paymentResource")
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	@PostMapping(value="/payNow")
	public PaymentResponse payTransaction(@RequestBody Payment payment) {
		System.out.println("Suresh Jenkins Test");
		return service.pay(payment);
	}

	@GetMapping(value="/getTransactionByVendor/{vendor}")
	public PaymentResponse getTransaction(@PathVariable String vendor) {
		System.out.println("Jenkins Build 2");
		return service.getTx(vendor);
		
	}
}
