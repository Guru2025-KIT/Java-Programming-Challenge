package com.w2w.common;

import java.util.ArrayList;
import java.util.List;

public class FeedbackModule {
    private List<String> feedbacks = new ArrayList<>();

    public void addFeedback(String user, String message) {
        feedbacks.add(user + ": " + message);
        System.out.println("[FEEDBACK] Received from " + user);
    }

    public void showAllFeedback() {
        System.out.println("\n--- All Feedback ---");
        for (String f : feedbacks) System.out.println(f);
    }
}
