package com.w2w.donor;

import java.util.ArrayList;
import java.util.List;

public class ItemDonationModule {
    private List<DonatedItem> allDonations = new ArrayList<>();

    public void addDonation(DonatedItem item) { allDonations.add(item); }

    public void listDonations() {
        System.out.println("\n--- Item Donations ---");
        for (DonatedItem item : allDonations) {
            System.out.println(item.getCategory() + " | Qty: " + item.getQuantity() + " | Status: " + item.getStatus());
        }
    }
}
