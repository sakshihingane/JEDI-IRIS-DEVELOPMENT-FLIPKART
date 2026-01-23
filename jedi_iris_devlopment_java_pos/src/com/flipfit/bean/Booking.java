package com.flipfit.bean;

public class Booking {
    private String bookingId;
    private String customerId;
    private String slotId;
    private String centreId;
    private String status; // e.g., "Confirmed", "Waitlist"

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public String getCentreId() {
        return centreId;
    }

    public void setCentreId(String centreId) {
        this.centreId = centreId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}