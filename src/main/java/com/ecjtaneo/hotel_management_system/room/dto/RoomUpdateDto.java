package com.ecjtaneo.hotel_management_system.room.dto;

import com.ecjtaneo.hotel_management_system.room.model.RoomStatus;
import com.ecjtaneo.hotel_management_system.room.model.RoomType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record RoomUpdateDto(
        @NotBlank
        RoomStatus status,

        @NotBlank
        RoomType type,

        @NotBlank
        @Min(value = 500)
        BigDecimal price_per_night
) {}
