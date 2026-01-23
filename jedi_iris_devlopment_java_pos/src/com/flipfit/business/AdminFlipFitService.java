package com.flipfit.business;

import com.flipfit.bean.GymCentre;
import com.flipfit.bean.GymOwner;
import java.util.ArrayList;
import java.util.List;

public class AdminFlipFitService implements AdminFlipFitInterface {
    @Override
    public void registerCustomer(String userName, String password, String email, String phoneNumber, String cardNumber) {
        // In a real app, this would call the DAO to save to the database.
        // For now, we print to console.
        System.out.println("-------------------------------------");
        System.out.println("Registering Customer: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Role: Customer");
        System.out.println("Account created successfully!");
        System.out.println("-------------------------------------");
    }

    @Override
    public void approveGymCentre(String centreId, boolean isApproved) {
        if(isApproved) {
            System.out.println("Gym Centre " + centreId + " has been approved.");
        } else {
            System.out.println("Gym Centre " + centreId + " has been rejected.");
        }
    }

    @Override
    public void approveGymOwner(String ownerId, boolean isApproved) {
        if(isApproved) {
            System.out.println("Gym Owner " + ownerId + " has been approved.");
        } else {
            System.out.println("Gym Owner " + ownerId + " has been rejected.");
        }
    }

    @Override
    public List<GymCentre> viewPendingGymCentres() {
        System.out.println("Fetching pending Gym Centres...");
        return new ArrayList<>();
    }

    @Override
    public List<GymOwner> viewPendingGymOwners() {
        System.out.println("Fetching pending Gym Owners...");
        return new ArrayList<>();
    }
}