package com.w2w.common;

public class Notification {
    private String message;
    private String recipient;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public void send() {
        System.out.println("[NOTIFICATION] To: " + recipient + " -> " + message);
    }
}