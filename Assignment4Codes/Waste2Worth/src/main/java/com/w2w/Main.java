package com.w2w;

import com.w2w.donor.*;
import com.w2w.fooddonor.*;
import com.w2w.ngo.*;
import com.w2w.volunteer.*;
import com.w2w.admin.*;
import com.w2w.system.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Waste2Worth (W2W) System ===\n");

        Donor donor = new Donor("D001", "Rahul", "rahul@email.com");
        donor.donateItem(new DonatedItem("Clothes", 5));
        donor.donateItem(new DonatedItem("Books", 10));
        donor.trackStatus();

        FoodDonor foodDonor = new FoodDonor("F001", "Priya", "priya@email.com");
        foodDonor.donateFood(new DonatedFood("Biryani", 10, "2026-03-11", false));
        foodDonor.donateFood(new DonatedFood("Rice", 5, "2026-03-10", true));
        foodDonor.trackStatus();

        NGO ngo = new NGO("N001", "HelpAll NGO", "helpall@ngo.com");
        ngo.sendRequest("Clothes");
        ngo.sendRequest("Biryani");
        ngo.trackRequests();

        Volunteer volunteer = new Volunteer("V001", "Amit", "amit@email.com");
        volunteer.assignPickup(new Pickup("P001", "Rahul House", "HelpAll NGO"));
        volunteer.trackDeliveries();

        Admin admin = new Admin("A001", "SuperAdmin");
        admin.verifyUser(donor.getName());
        admin.verifyUser(ngo.getName());
        admin.managedonation("Clothes - 5 units");
        admin.generateReport();

        CentralSystem system = new CentralSystem();
        system.showSocialImpactStats();
        system.searchAndFilter("Food");
    }
}
