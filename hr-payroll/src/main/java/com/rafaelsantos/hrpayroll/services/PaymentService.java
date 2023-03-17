package com.rafaelsantos.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelsantos.hrpayroll.entities.Payment;
import com.rafaelsantos.hrpayroll.entities.Worker;
import com.rafaelsantos.hrpayroll.feignclients.WorkerFeignClients;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClients workerFeignClients;
	
	public Payment getPayment(Long workerId, int days) {
		Worker worker = workerFeignClients.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
