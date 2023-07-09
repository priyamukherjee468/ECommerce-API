package com.example.EcommerceAPI.Repository;

import com.example.EcommerceAPI.Model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Integer> {
}
