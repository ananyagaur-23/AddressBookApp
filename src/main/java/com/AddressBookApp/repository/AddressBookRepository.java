package com.AddressBookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AddressBookApp.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
}