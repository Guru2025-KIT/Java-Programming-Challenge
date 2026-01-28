import java.util.Scanner;

public class AreaCircumference {
    
    float radius;

    AreaCircumference(float Radius){
        this.radius=Radius;
        // Area(Radius);
        // Circum(Radius);
    }

    @Override
    public String toString(){
        return "Circle Prones:\nRadius"+radius+"\nArea:"+Area(radius)+" Circumference:"+Circum(radius);
    }
    

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter The Radius of Circle: ");
        float Radius=input.nextFloat();
        AreaCircumference rad=new AreaCircumference(Radius);
        System.out.println(rad); 
        input.close();

    }

    public float Area(float Radius){
        float area=(float)(Math.PI*Math.pow(Radius, 2));
        return area;
    }

    public double Circum(float Radius){
        double circumference=2*Math.PI*Radius;
        return circumference;
    }
}
