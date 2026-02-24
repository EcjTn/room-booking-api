package com.ecjtaneo.hotel_management_system.booking.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record BookingCreationDto(
        String roomNumber,
        LocalDate startDate,
        LocalDate endDate
) {}
