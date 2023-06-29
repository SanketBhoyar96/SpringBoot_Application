package com.soft.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soft.model.Product;

@Repository
public interface ProductRepositary extends JpaRepository<Product,Integer> {

}
