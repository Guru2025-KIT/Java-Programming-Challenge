package Assignment4;

public class FarmA58 {
    String farmerName;
    static String farmName = "Sunrise Farm"; // static variable

    FarmA58(String name) {
        farmerName = name;
    }

    void display() {
        System.out.println("Farmer Name: " + farmerName);
        System.out.println("Farm Name: " + farmName);
    }

    public static void main(String[] args) {
        FarmA58 f1 = new FarmA58("Guruprasad");
        FarmA58 f2 = new FarmA58("Vivek");

        f1.display();
        System.out.println();

        f2.display();
    }
}
