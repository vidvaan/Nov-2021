package com.createiq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.repository.VendorRepository;

@RestController
public class VendorController {
	
	@Autowired
	private VendorRepository vendorRepository;

}
