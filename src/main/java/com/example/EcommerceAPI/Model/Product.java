package com.example.EcommerceAPI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

       @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer ProductId;

        private String ProductName;

        private Integer ProductPrice;

        private String ProductDescription;

        private String ProductCategory;
        private String ProductBrand;

    }
