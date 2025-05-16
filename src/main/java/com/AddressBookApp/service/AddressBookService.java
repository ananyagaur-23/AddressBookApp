package com.AddressBookApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AddressBookApp.dto.AddressBookDTO;
import com.AddressBookApp.model.AddressBookData;
import com.AddressBookApp.repository.AddressBookRepository;

import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    @Autowired
    private AddressBookRepository repository;

    public List<AddressBookData> getAll() {
        return repository.findAll();
    }

    public AddressBookData getById(int id) {
        return repository.findById(id).orElse(null);
    }

    public AddressBookData create(AddressBookDTO dto) {
        AddressBookData data = new AddressBookData(0, dto.getName(), dto.getAddress(), dto.getCity(), dto.getState(), dto.getZip(), dto.getPhone());
        return repository.save(data);
    }

    public AddressBookData update(int id, AddressBookDTO dto) {
        AddressBookData data = new AddressBookData(id, dto.getName(), dto.getAddress(), dto.getCity(), dto.getState(), dto.getZip(), dto.getPhone());
        return repository.save(data);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}