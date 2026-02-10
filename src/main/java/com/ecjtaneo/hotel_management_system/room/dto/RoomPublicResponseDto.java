package com.ecjtaneo.hotel_management_system.room.dto;

import com.ecjtaneo.hotel_management_system.room.model.RoomStatus;
import com.ecjtaneo.hotel_management_system.room.model.RoomType;

import java.math.BigDecimal;

public record RoomPublicResponseDto(
        Long id,
        String roomNumber,
        RoomStatus roomStatus,
        RoomType roomType,
        BigDecimal price_per_night
) {
}
