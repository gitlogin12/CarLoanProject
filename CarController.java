package com.app.loan.controller;

import java.util.Random;
import java.util.Scanner;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.loan.ServiceImpl.CibilServiceImpl;
import com.app.loan.model.CiblilScore;

@RestController
public class CarController {
	
	@Autowired
	CibilServiceImpl cs;
	
	 // post data
	@PostMapping(value = "/cibil")
	public ResponseEntity<Integer> saveCibil(@Valid @RequestBody CiblilScore c){
	System.out.println("saveCibil()"+c);	
	
	//Scanner sc=new Scanner(System.in);
	
	CiblilScore c1=new CiblilScore();
	
	//System.out.println("Enter Pan Number..");
	
	//String p=sc.next();
	
    c1.setPannumber(c.getPannumber());	
	
	Random r=new Random();
	int ci=r.nextInt(1000);
	
	Integer c3 = 650;
	if(ci>=650) {
	c1.setCibilscore(ci);
	 c3= ci;
	System.out.println(c1);
	}
	else {
		
		System.out.println("Try again...");
	     
	}
		
		return new ResponseEntity<Integer>(c3,HttpStatus.OK);
	}
	

}
