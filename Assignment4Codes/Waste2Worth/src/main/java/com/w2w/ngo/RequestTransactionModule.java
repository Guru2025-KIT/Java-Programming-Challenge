package com.w2w.ngo;

import java.util.ArrayList;
import java.util.List;

public class RequestTransactionModule {
    private List<DonationRequest> transactions = new ArrayList<>();

    public void addRequest(DonationRequest req) { transactions.add(req); }

    public void showTransactions() {
        System.out.println("\n--- All Transactions ---");
        for (DonationRequest r : transactions) r.display();
    }
}
