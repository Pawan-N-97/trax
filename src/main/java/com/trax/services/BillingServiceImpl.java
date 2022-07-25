package com.trax.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Billing;
import com.trax.entities.repository.BillingRepository;


@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;
	
	
	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);
	}

}
