package com.spring.rest.curd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Payment_Table")
public class Payment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int     id;
	private String  transactionId;
	private String  vendor;
	private double  amount;
	private Date    paymentDate;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Payment(String transactionId, String vendor, double amount, Date paymentDate) {
		super();
		this.transactionId = transactionId;
		this.vendor = vendor;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}
	public Payment() {
		super();
	}
	
	
}
