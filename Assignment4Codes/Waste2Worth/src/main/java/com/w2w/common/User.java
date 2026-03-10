package com.w2w.common;

public class User {
    protected String id;
    protected String name;
    protected String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Email: " + email);
    }
}
