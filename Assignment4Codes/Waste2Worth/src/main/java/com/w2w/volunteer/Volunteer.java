package com.w2w.volunteer;

import com.w2w.common.User;
import java.util.ArrayList;
import java.util.List;

public class Volunteer extends User {
    private List<Pickup> pickups = new ArrayList<>();

    public Volunteer(String id, String name, String email) {
        super(id, name, email);
    }

    public void assignPickup(Pickup pickup) {
        pickups.add(pickup);
        System.out.println("[VOLUNTEER] " + name + " assigned pickup from: " + pickup.getFromLocation());
    }

    public void trackDeliveries() {
        System.out.println("\n[VOLUNTEER STATUS] " + name + " has " + pickups.size() + " pickup(s).");
    }
}
