package com.trax.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trax.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
