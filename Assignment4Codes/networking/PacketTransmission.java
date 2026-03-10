package networking;

public class PacketTransmission {
    public static void main(String[] args) {
        String sender = "Computer A";
        String receiver = "Computer B";
        String packet = "Hello, Network!";

        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Packet Data: " + packet);

        System.out.println("\nTransmitting packet...");
        System.out.println("Packet successfully transmitted from " + sender + " to " + receiver);
    }
}