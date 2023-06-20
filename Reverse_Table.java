import java.util.Scanner;
public class Reverse_Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value");
        int a = sc.nextInt();
        for(int i = 10; i!=0; i--){
            System.out.println("The value of "+a+"X"+i+" is\n"+a*i);
        }
    }
}
