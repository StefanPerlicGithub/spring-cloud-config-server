package com.ftn.get.repository;

import com.ftn.get.model.MethodOfPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MethodOfPaymentRepository extends JpaRepository<MethodOfPayment, Long> {
}
