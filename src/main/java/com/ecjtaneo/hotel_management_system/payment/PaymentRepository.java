package com.ecjtaneo.hotel_management_system.payment;

import com.ecjtaneo.hotel_management_system.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
