package com.w2w.donor;

import com.w2w.common.User;
import java.util.ArrayList;
import java.util.List;

public class Donor extends User {
    private List<DonatedItem> donatedItems = new ArrayList<>();

    public Donor(String id, String name, String email) {
        super(id, name, email);
    }

    public void donateItem(DonatedItem item) {
        donatedItems.add(item);
        System.out.println("[DONOR] " + name + " donated: " + item.getCategory() + " x" + item.getQuantity());
    }

    public void trackStatus() {
        System.out.println("\n[DONOR STATUS] " + name + " donated " + donatedItems.size() + " item(s).");
    }
}
