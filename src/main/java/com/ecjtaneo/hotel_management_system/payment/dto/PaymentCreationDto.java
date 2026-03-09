package com.ecjtaneo.hotel_management_system.payment.dto;

import java.math.BigDecimal;

public record PaymentCreationDto(
        Long bookingId,
        BigDecimal totalAmount
) {}
