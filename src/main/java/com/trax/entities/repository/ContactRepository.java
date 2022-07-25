package com.trax.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trax.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
