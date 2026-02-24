package com.ecjtaneo.hotel_management_system.booking;

import com.ecjtaneo.hotel_management_system.booking.dto.BookingCreationDto;
import com.ecjtaneo.hotel_management_system.common.dto.MessageResponseDto;
import com.ecjtaneo.hotel_management_system.infrastructure.security.UserDetailsImpl;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public MessageResponseDto createBooking(
            @RequestBody @Valid BookingCreationDto bookingCreationDto,
            @AuthenticationPrincipal UserDetailsImpl userDetails) {
        Long userId = userDetails.getUserId();
        return bookingService.createBooking(bookingCreationDto, userId);
    }

}
