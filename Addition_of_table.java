import java.util.Scanner;

public class Addition_of_table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //         using While Loop;
        System.out.println("Enter the value:");
        int a = sc.nextInt();
        int b = 1;
        int sum = 0;
        while (b <= 10) {
            sum = sum +(a*b);
            System.out.println("value of " + a + "X" + b + " is\n" + a * b);
            b++;

        }
        System.out.println("The sum of multiplication table of "+a+" is");
        System.out.println(sum);
    }
}