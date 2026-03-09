package com.ecjtaneo.hotel_management_system.payment;

import com.ecjtaneo.hotel_management_system.booking.BookingService;
import com.ecjtaneo.hotel_management_system.payment.dto.PaymentCreationDto;
import com.ecjtaneo.hotel_management_system.payment.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final BookingService bookingService;

    public PaymentService(PaymentRepository paymentRepository, BookingService bookingService) {
        this.paymentRepository = paymentRepository;
        this.bookingService = bookingService;
    }

    public void createNewPayment(PaymentCreationDto paymentCreationDto) {
        Payment payment = new Payment();
        payment.setBooking(bookingService.getBookingReference(paymentCreationDto.bookingId()));
        payment.setTotalAmount(paymentCreationDto.totalAmount());

        paymentRepository.save(payment);
    }

}
