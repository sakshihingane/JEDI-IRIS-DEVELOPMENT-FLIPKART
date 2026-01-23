package com.flipfit.business;

import com.flipfit.bean.Booking;
import java.util.ArrayList;
import java.util.List;

public class CustomerFlipFitService implements CustomerFlipFitInterface {

    @Override
    public boolean bookSlot(String bookingId, String slotId, String customerId) {
        System.out.println("Booking initiated for Customer: " + customerId + " on Slot: " + slotId);
        return true;
    }

    @Override
    public boolean cancelBooking(String bookingId, String customerId) {
        System.out.println("Cancelling booking: " + bookingId);
        return true;
    }

    @Override
    public List<Booking> viewMyBookings(String customerId) {
        System.out.println("Fetching bookings for customer: " + customerId);
        return new ArrayList<>(); // Returns empty list for now
    }

    @Override
    public boolean makePayment(String bookingId) {
        System.out.println("Payment successful for Booking: " + bookingId);
        return true;
    }
}