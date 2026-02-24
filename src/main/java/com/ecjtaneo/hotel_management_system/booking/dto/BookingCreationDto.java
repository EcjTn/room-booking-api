package com.ecjtaneo.hotel_management_system.booking.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record BookingCreationDto(
        @NotNull
        String roomNumber,
        @NotNull
        LocalDate startDate,
        @NotNull
        LocalDate endDate
) {}
