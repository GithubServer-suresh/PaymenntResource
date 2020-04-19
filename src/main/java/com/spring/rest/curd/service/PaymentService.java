package com.spring.rest.curd.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.curd.dao.PaymentDao;
import com.spring.rest.curd.dto.PaymentResponse;
import com.spring.rest.curd.model.Payment;


@Service
@Transactional
public class PaymentService {

	@Autowired
	private PaymentDao dao;
	
	
	public PaymentResponse pay(Payment payment) {
		payment.setPaymentDate(new Date());
		String message=dao.payNow(payment);
		PaymentResponse response =new PaymentResponse();
		response.setStatus("success");
		response.setResponse(message);
		response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a ").format(new Date()));
		return response;
	}
	
	
	
	public PaymentResponse getTx(String vendor) {
		List<Payment> payments=dao.getTransactionInfo(vendor);
		PaymentResponse response=new PaymentResponse();
		response.setStatus("Success");
		response.setPayments(payments);
		return response;
	}
	
	
	
}
