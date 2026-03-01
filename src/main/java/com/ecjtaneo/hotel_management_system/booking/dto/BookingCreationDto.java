package com.ecjtaneo.hotel_management_system.booking.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record BookingCreationDto(
        @NotBlank
        String roomNumber,
        @NotBlank
        LocalDate startDate,
        @NotBlank
        LocalDate endDate
) {}
