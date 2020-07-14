package com.ftn.post.repository;

import com.ftn.post.model.MethodOfPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MethodOfPaymentRepository extends JpaRepository<MethodOfPayment, Long> {
}
