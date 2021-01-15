import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 number:");
       // boolean flag=sc.hasNextInt();               // Tells us whether entered number is Int or not
       // System.out.println(flag);
        int a=sc.nextInt();
        System.out.println("Enter 2 number:");
       // boolean flag1 =sc.hasNextInt();             // Tells us whether entered number is Int or not
       // System.out.println(flag1);
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum:"+sum);
    }
}
