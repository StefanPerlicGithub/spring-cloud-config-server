package com.ftn.delete.repository;

import com.ftn.delete.model.MethodOfPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MethodOfPaymentRepository extends JpaRepository<MethodOfPayment, Long> {
}
