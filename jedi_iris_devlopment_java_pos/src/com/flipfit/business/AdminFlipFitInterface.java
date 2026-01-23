package com.flipfit.business;

import com.flipfit.bean.GymCentre;
import com.flipfit.bean.GymOwner;
import java.util.List;

public interface AdminFlipFitInterface {
    void registerCustomer(String userName, String password, String email, String phoneNumber, String cardNumber);
    void approveGymCentre(String centreId, boolean isApproved);
    void approveGymOwner(String ownerId, boolean isApproved);
    List<GymCentre> viewPendingGymCentres();
    List<GymOwner> viewPendingGymOwners();
}