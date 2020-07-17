import java.util.Scanner;
public class DemoScannerQues {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your FirstName");
        String firstName = object.next();
        System.out.println("Enter your rollNumber");
        int rollNumber = object.nextInt();
        System.out.println("Enter your percentage");
        double per = object.nextDouble();
        System.out.println("Enter your course year");
        int yr = object.nextInt();
        object.nextLine();
        System.out.println("Enter your course");
        String course = object.nextLine();

        System.out.println("FirstName " +  firstName);
        System.out.println("Roll number " +  rollNumber);
        System.out.println("Percentage " +  per);
        System.out.println("Year " + yr );
        System.out.print("Course " +  course);



    }


}
