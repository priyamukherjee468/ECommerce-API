package com.example.EcommerceAPI.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer addressId;

    private String addressName;

    private String addressLandmark;

    private String addressPhoneNumber;

    private Integer addressZipcode;

    private String addressState;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User userID;

}
