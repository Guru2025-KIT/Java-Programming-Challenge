package com.w2w.volunteer;

import java.util.ArrayList;
import java.util.List;

public class VolunteerModule {
    private List<Volunteer> volunteers = new ArrayList<>();

    public void registerVolunteer(Volunteer v) {
        volunteers.add(v);
        System.out.println("[VOLUNTEER MODULE] Registered: " + v.getName());
    }

    public void listVolunteers() {
        System.out.println("\n--- Registered Volunteers ---");
        for (Volunteer v : volunteers) {
            v.displayInfo();
        }
    }
}