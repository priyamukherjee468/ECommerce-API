package com.example.EcommerceAPI.Repository;


import com.example.EcommerceAPI.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
}
