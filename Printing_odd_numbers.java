import java.util.Scanner;
public class Printing_odd_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //      Using While loop
       /* System.out.println("Enter the starting number");
        int b = sc.nextInt();
        System.out.println("Enter the number of odd numbers to be printed");
        int a = sc.nextInt();
        int c = a+b;
        while(b<=c){
            System.out.println(2*b+1);
            b++;
        }*/

        //      Using Do While Loop
       /* System.out.println("Enter the starting number");
        int e = sc.nextInt();
        System.out.println("Enter the number of odd numbers to be printed");
        int f = sc.nextInt();
        int g = e+f;
        do{
            System.out.println(2*e+1);
            e++;
        }while(e<=g);*/

        //     Using For Loop
        System.out.println("Enter the number of odd numbers to be printed");
        int i = sc.nextInt();
        for(int h = 0; h<=i; h++){
            System.out.println(2*h+1);
        }
    }
}
