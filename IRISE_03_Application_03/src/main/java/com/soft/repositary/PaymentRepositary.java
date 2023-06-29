package com.soft.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soft.model.StudentPayment;

@Repository
public interface PaymentRepositary extends JpaRepository<StudentPayment,Integer> {

}
