package com.spring.rest.curd.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestController {

	Logger log= Logger.getLogger("TestController");
	
	public String viewt() {
		log.log(Level.ALL, this.viewt(), "Message");
		System.out.println("SOP added");
		return "Vendor";
	}
	
	public String let() {
		return "";
	}
	
	
}
