import java.util.Scanner;
public class DemoScanner {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = object.nextLine();
        System.out.println("enter your age");
        byte age = object.nextByte();
        System.out.println("Enter 4-Digit code");
        short code = object.nextShort();
        System.out.println("Enter your CPI ");
        double cpi = object. nextDouble();
        System.out.println("Enter your mobile phone number");
        long mobile = object.nextLong();
        System.out.println("Enter your exam status true for pass/ false for fail ");
        boolean passed= object.nextBoolean();
        System.out.println("Name :"+ name);
        System.out.println("Age : "+ age);
        System.out.println("4-Digit code: " + code);
        System.out.println("Mobile Number : "+ mobile);
        System.out.println("Passed: " +passed );


    }
}
