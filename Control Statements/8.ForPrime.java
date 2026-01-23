import java.util.Scanner;

public class ForPrime{
    public static void main(String[] args){

        System.out.print("Welcome in Prime Number Program:");
        Scanner input=new Scanner(System.in);

        int n=input.nextInt();

        boolean isprime=isPrime(n);

        if(n==1 || n<0){
            System.out.println(n+" is Not Prime.");
        }else if(isprime){
            System.out.println(n+" Is Prime.");
        }else{
            System.out.println(n+" Is not Prime.");
        }

    }

    private  static boolean isPrime(int n){
        boolean isPrime=true;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }

        }
        return isPrime;
    }
}