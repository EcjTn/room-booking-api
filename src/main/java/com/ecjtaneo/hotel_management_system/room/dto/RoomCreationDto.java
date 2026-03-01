package com.ecjtaneo.hotel_management_system.room.dto;


import com.ecjtaneo.hotel_management_system.room.model.RoomStatus;
import com.ecjtaneo.hotel_management_system.room.model.RoomType;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record RoomCreationDto(
        @NotBlank
        String roomNumber,

        @NotBlank
        RoomStatus status,

        @NotBlank
        RoomType type,

        @NotBlank
        BigDecimal price_per_night
) {}
