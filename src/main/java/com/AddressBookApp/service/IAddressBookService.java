package com.AddressBookApp.service;


import java.util.List;

import com.AddressBookApp.dto.AddressBookDTO;
import com.AddressBookApp.model.AddressBookData;

public interface IAddressBookService {
    List<AddressBookData> getAll();
    AddressBookData getById(int id);
    AddressBookData create(AddressBookDTO dto);
    AddressBookData update(int id, AddressBookDTO dto);
    void delete(int id);
}