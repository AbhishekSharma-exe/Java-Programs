import java.util.Scanner;
public class PercentageCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t**** Welcome to CBSE Boards Percentage calculator ****");
        System.out.println("\nEnter your marks out of 100 according to the corresponding Subjects\n");
        System.out.println("Enter your Maths marks : ");
        float maths=sc.nextFloat();
        System.out.println("Enter your Science marks : ");
        float science=sc.nextFloat();
        System.out.println("Enter your Social Science marks : ");
        float ssc=sc.nextFloat();
        System.out.println("Enter your English marks : ");
        float eng=sc.nextFloat();
        System.out.println("Enter your Hindi marks : ");
        float hin=sc.nextFloat();
        float per= (maths+science+ssc+hin+eng)/5;
        System.out.println("\n Your Percentage : "+per);
    }
}
