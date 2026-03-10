package com.w2w.system;

public class SocialImpactStats {
    private int peopleFed;
    private int itemsDonated;
    private int deliveriesCompleted;

    public SocialImpactStats(int peopleFed, int itemsDonated, int deliveriesCompleted) {
        this.peopleFed = peopleFed;
        this.itemsDonated = itemsDonated;
        this.deliveriesCompleted = deliveriesCompleted;
    }

    public void display() {
        System.out.println("  People Fed       : " + peopleFed);
        System.out.println("  Items Donated    : " + itemsDonated);
        System.out.println("  Deliveries Done  : " + deliveriesCompleted);
    }
}