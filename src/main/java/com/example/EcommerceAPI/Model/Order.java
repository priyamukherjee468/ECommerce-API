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

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer OrderId;

    @ManyToOne

    private User userID;

    @ManyToOne
    private Product productID;

    @ManyToOne
    private Address addressID;

    private Integer productQuantity;
}
