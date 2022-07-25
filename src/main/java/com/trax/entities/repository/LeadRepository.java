package com.trax.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trax.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
