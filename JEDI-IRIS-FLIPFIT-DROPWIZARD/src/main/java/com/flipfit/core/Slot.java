package com.flipfit.core;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.ArrayList;

public class Slot {
    private String id;
    private String centerId; // Link to the Center
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int capacity;
    private String bookedMemberIds;
    private List<String> bookedMemberList; // List of GymMember IDs who booked this slot

    public Slot() {
        this.bookedMemberList = new ArrayList<>();
    }

    public Slot(String id, String centerId, LocalDateTime startTime, LocalDateTime endTime, int capacity) {
        this.id = id;
        this.centerId = centerId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.capacity = capacity;
        this.bookedMemberList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookedMemberIds() {
        return this.bookedMemberIds;
    }

    public void setBookedMemberIds(String id) {
        this.bookedMemberIds = id;
    }

    public String getCenterId() {
        return centerId;
    }


    public void setCenterId(String centerId) {
        this.centerId = centerId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getbookedMemberList() {
        return bookedMemberList;
    }

    public void setbookedMemberList(List<String> bookedMemberList) {
        this.bookedMemberList = bookedMemberList;
    }

    public int getRemainingSeats() {
        return capacity - bookedMemberList.size();
    }

    public boolean addMember(String gymMemberId) {
        if (bookedMemberList.size() < capacity && !bookedMemberList.contains(gymMemberId)) {
            bookedMemberList.add(gymMemberId);
            recalculateString();
            return true;
        }
        return false;
    }

    public boolean removeMember(String gymMemberId) {
        boolean temp = bookedMemberList.remove(gymMemberId);
        recalculateString();
        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slot slot = (Slot) o;
        return capacity == slot.capacity &&
                Objects.equals(id, slot.id) &&
                Objects.equals(centerId, slot.centerId) &&
                Objects.equals(startTime, slot.startTime) &&
                Objects.equals(endTime, slot.endTime) &&
                Objects.equals(bookedMemberList, slot.bookedMemberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, centerId, startTime, endTime, capacity, bookedMemberList);
    }
    private void recalculateString(){
        String recalc = "";
        for(String curr: this.bookedMemberList){
            recalc += curr + ",";
        }
        this.bookedMemberIds = recalc;
    }
}
