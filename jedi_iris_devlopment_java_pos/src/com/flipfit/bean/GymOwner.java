package com.flipfit.bean;

import java.util.List;

public class GymOwner extends User {
    private String ownerId;
    private String accountNumber;
    private String debitCard;
    private String creditCard;
    // In the diagram, Owner has a relationship with "city" (Centres).
    // We represent that as a List of centre IDs here.
    private List<String> gymCentreIds;

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(String debitCard) {
        this.debitCard = debitCard;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public List<String> getGymCentreIds() {
        return gymCentreIds;
    }

    public void setGymCentreIds(List<String> gymCentreIds) {
        this.gymCentreIds = gymCentreIds;
    }

}