/*
Print any given inputString in the following format.

Output
index: 0 1 2 3 4
chars: H e l l o

Every character is separated by tab, use "\t" for inserting tab.
 */
import java.util.Scanner;
public class task5 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String");
        String inputString =sc.nextLine();
        System.out.println("Output");
        System.out.print("index:");
        for (int n=0; n<inputString.length(); n++)
            System.out.print("\t"+n);
        System.out.println();
        System.out.print("chars:");
        for (int n=0; n<inputString.length(); n++)
            System.out.print("\t"+inputString.charAt(n));

    }
}
