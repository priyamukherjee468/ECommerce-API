package com.example.EcommerceAPI.Service;

import com.example.EcommerceAPI.Model.User;
import com.example.EcommerceAPI.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public User addUser(User user) {
        return iUserRepo.save(user);
    }

    public User getOrder(Integer userId) {
        return iUserRepo.findById(userId).get();
    }
}
