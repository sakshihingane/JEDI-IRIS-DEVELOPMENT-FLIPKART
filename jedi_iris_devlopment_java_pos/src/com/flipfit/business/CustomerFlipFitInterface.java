package com.flipfit.business;

import com.flipfit.bean.Booking;
import java.util.List;

public interface CustomerFlipFitInterface {
    boolean bookSlot(String bookingId, String slotId, String customerId);
    boolean cancelBooking(String bookingId, String customerId);
    List<Booking> viewMyBookings(String customerId);
    boolean makePayment(String bookingId);
}