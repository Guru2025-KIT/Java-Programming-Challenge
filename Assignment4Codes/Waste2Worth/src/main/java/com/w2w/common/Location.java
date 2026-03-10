package com.w2w.common;

public class Location {
    private String address;
    private String city;
    private String pincode;

    public Location(String address, String city, String pincode) {
        this.address = address;
        this.city = city;
        this.pincode = pincode;
    }

    public String getFullAddress() {
        return address + ", " + city + " - " + pincode;
    }

    public void display() {
        System.out.println("Location: " + getFullAddress());
    }
}
