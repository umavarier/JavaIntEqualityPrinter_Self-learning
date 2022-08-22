//program to check the equality of 3 numbers.

import javax.swing.*;

import java.util.Scanner;

public class IntEqualityPrinter {

    public static void main(String[] ars)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter # numbers: ");
        System.out.println("First number: ");
        int n1=sc.nextInt();
        sc.nextLine();
        System.out.println("Second number: ");
        int n2=sc.nextInt();
        sc.nextLine();
        System.out.println("Third Number: ");
        int n3= sc.nextInt();
        sc.nextLine();

        printEqual(n1,n2,n3);
    }

    public static void printEqual(int n1, int n2, int n3)
    {
        if((n1<0) || (n2<0) || (n3<0))
        {
            System.out.println("Invalid Value");

        }
        else
        {
            if((n1==n2)&&(n2==n3)&&(n1==n3))
            {
                System.out.println("All numbers are equal");
            }
            else if((n1!=n2)&&(n2!=n3)&&(n1!=n3))
            {
                System.out.println("All numbers are different");
            }
            else
            {
                System.out.println("Neither all are equal or different");
            }
        }
    }


}
