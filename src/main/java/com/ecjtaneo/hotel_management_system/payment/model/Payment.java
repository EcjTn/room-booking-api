package com.ecjtaneo.hotel_management_system.payment.model;

import com.ecjtaneo.hotel_management_system.booking.model.Booking;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    Booking booking;

    private BigDecimal totalAmount;
    private final LocalDateTime createdAt = LocalDateTime.now();
}
