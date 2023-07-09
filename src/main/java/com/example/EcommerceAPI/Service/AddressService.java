package com.example.EcommerceAPI.Service;

import com.example.EcommerceAPI.Model.Address;
import com.example.EcommerceAPI.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public void addAddress(Address address) {

            iAddressRepo.save(address);
        }
    }

