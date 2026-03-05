package com.ecjtaneo.hotel_management_system.booking;

import com.ecjtaneo.hotel_management_system.booking.dto.BookingPublicResponseDto;
import com.ecjtaneo.hotel_management_system.infrastructure.security.UserDetailsImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/me/bookings")
public class UserBookingController {
    private final BookingService bookingService;

    public UserBookingController(BookingService bookingMapper) {
        this.bookingService = bookingMapper;
    }

    @GetMapping()
    public List<BookingPublicResponseDto> showBookings(
            @RequestParam(name = "cursor", required = false) Long cursor,
            @AuthenticationPrincipal UserDetailsImpl userDetails) {

        Long userId = userDetails.getUserId();
        if(cursor == null) return bookingService.showBookings(userId);
        return bookingService.showBookingsBefore(cursor, userId);
    }

}
