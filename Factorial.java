import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //     Using While Loop
        System.out.println("Enter your value");
        long a = sc.nextLong();
        long i =1;
        long factorial = 1;
        while(i<=a){
            factorial *= i;
            i++;
        }
        System.out.println("The value of factorial of "+a+" is \n"+factorial);
        //      Using For Loop
        System.out.println("Enter your value");
        long b = sc.nextLong();
        long Factorial = 1;
        for(long j =1; j<=b; j++){
            Factorial *= j;
        }
        System.out.println("The value of factorial of "+b+" is \n"+Factorial);
    }
}
