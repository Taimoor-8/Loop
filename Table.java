import java.util.Scanner;
public class Table {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        //         using While Loop;
     /*   System.out.println("Enter the value:");
        int a = sc.nextInt();
        int b = 1;
        while(b<=10){
            System.out.println("value of "+a+"*"+b+ " is\n"+a*b);
            b++;
        }*/

        //         Using For Loop
        System.out.println("Enter the value:");
        int c = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println("value of "+c+"X"+i+" is\n"+c*i);
        }

        //    Using Do While Loop
       /* System.out.println("Enter the value:");
        int d = sc.nextInt();
        int e = 1;
        do{
            System.out.println("value of "+d+"*"+e+" is\n"+d*e);
            e++;
        }while(e<=10);*/

    }
}
