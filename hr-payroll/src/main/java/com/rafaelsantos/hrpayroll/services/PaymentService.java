package com.rafaelsantos.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.rafaelsantos.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workderId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
