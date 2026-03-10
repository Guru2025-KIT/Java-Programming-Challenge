package com.w2w.ngo;

import com.w2w.common.User;
import java.util.ArrayList;
import java.util.List;

public class NGO extends User {
    private List<DonationRequest> requests = new ArrayList<>();

    public NGO(String id, String name, String email) {
        super(id, name, email);
    }

    public void sendRequest(String itemNeeded) {
        requests.add(new DonationRequest(name, itemNeeded));
        System.out.println("[NGO] " + name + " requested: " + itemNeeded);
    }

    public void trackRequests() {
        System.out.println("\n[NGO STATUS] " + name + " has " + requests.size() + " request(s).");
        for (DonationRequest r : requests) r.display();
    }
}
