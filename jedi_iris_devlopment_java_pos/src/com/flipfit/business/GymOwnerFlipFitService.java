package com.flipfit.business;

import com.flipfit.bean.GymCentre;
import com.flipfit.bean.Slots;
import java.util.ArrayList;
import java.util.List;

public class GymOwnerFlipFitService implements GymOwnerFlipFitInterface {

    @Override
    public void registerGymOwner(String userName, String password, String email, String panNumber, String cardNumber) {
        System.out.println("-------------------------------------");
        System.out.println("Registering Gym Owner: " + userName);
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Role: GymOwner");
        System.out.println("Account sent for approval!");
        System.out.println("-------------------------------------");
    }
    @Override
    public void addCentre(GymCentre gymCentre) {
        System.out.println("Gym Centre added successfully: " + gymCentre.getCentreName());
    }

    @Override
    public List<GymCentre> viewMyCentres(String ownerId) {
        System.out.println("Fetching centres for owner: " + ownerId);
        return new ArrayList<>();
    }

    @Override
    public void addSlot(Slots slot) {
        System.out.println("Slot added to centre: " + slot.getCentreId());
    }
}