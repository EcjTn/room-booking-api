package com.ecjtaneo.hotel_management_system.booking.mapper;

import com.ecjtaneo.hotel_management_system.booking.dto.BookingPublicResponseDto;
import com.ecjtaneo.hotel_management_system.booking.model.Booking;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookingMapper {
    public List<BookingPublicResponseDto> toDtoList(List<Booking> bookings);
}
