package com.w2w.system;

public class CentralSystem {
    private SocialImpactStats stats = new SocialImpactStats(25, 18, 12);
    private SearchFilter filter = new SearchFilter();
    private LocationMatching locationMatching = new LocationMatching();

    public void showSocialImpactStats() {
        System.out.println("\n[CENTRAL SYSTEM] Social Impact Stats:");
        stats.display();
    }

    public void searchAndFilter(String keyword) {
        filter.search(keyword);
    }

    public void matchLocation(String donor, String ngo) {
        locationMatching.match(donor, ngo);
    }
}
