package com.ecjtaneo.hotel_management_system.booking;

import com.ecjtaneo.hotel_management_system.booking.model.BookingStatus;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteBookingById(id);
    }

    public int updateStatusById(Long id, BookingStatus status) {
        return bookingRepository.updateStatusById(id, status);
    }

}
