package com.w2w.admin;

import com.w2w.common.User;

public class Admin extends User {
    public Admin(String id, String name) {
        super(id, name, "admin@w2w.com");
    }

    public void verifyUser(String userName) {
        System.out.println("[ADMIN] Verified user: " + userName);
    }

    public void managedonation(String donation) {
        System.out.println("[ADMIN] Managing donation: " + donation);
    }

    public void generateReport() {
        System.out.println("[ADMIN] Analytics Report Generated Successfully.");
    }
}
