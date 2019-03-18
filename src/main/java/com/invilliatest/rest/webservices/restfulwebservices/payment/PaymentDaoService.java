package com.invilliatest.rest.webservices.restfulwebservices.payment;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PaymentDaoService {
	private static List<Payment> payments = new ArrayList<>();
	private static int paymentsCount = 5;
	static {
		payments.add(new Payment(1, "processando", "1234562", new Date()));
		payments.add(new Payment(2, "processando", "1234563", new Date()));
		payments.add(new Payment(3, "processando", "1234564", new Date()));
		payments.add(new Payment(4, "iniciando", "1234565", new Date()));
		payments.add(new Payment(5, "autorizado", "1234566", new Date()));
	}
	
	public List<Payment> findAll(){
		return payments;
	}
	
	public Payment save(Payment payment) {
		if(payment.getId() == null) {
			payment.setId(++paymentsCount);
		}
		payments.add(payment);
		return payment;
	}
	
	public Payment findOne(int id) {
		for (Payment payment : payments) {
			if(payment.getId() == id) {
				return payment;
			}
		}
		return null;
	}
	
	public Payment deleteById(int id) {
		Iterator<Payment> iterator = payments.iterator();
		while (iterator.hasNext()) {
			Payment payment = iterator.next();
			if(payment.getId() == id) {
				iterator.remove();
				return payment;
			}
			
		}
		return null;
	}
	
}
