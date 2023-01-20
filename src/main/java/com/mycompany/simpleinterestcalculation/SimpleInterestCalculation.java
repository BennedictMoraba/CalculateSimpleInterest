
package com.mycompany.simpleinterestcalculation;
import java.util.Scanner;

public class SimpleInterestCalculation 
{

    public static void main(String[] args) 
    {
        //Institiate a Scanner for user Input
        Scanner sc = new Scanner(System.in);
        
        //Declare a string that will hold the input values
        String inputString;
        
        //Prompt the user to input the following text "Java Simple-Interest 5 10 15"
        System.out.println("Enter the input string: ");
        inputString = sc.nextLine();
        
        //Extract the numbers from the string text
        String interestNumbers = inputString.substring(21);
        
        //Extract the numbers to match the simple interest values
        int P = Integer.parseInt(interestNumbers.substring(0, 1));
        int N = Integer.parseInt(interestNumbers.substring(2, 4));
        int R = Integer.parseInt(interestNumbers.substring(5, 7));
        
        //Declare and calculate the simple interest
        double simpleInterest = (P*N*R)/100;
        
        //Display the PNR values
        System.out.println("The PNR values are: " + P + " " + N +" " + R);
        
        //Display the simple interest value
        System.out.println("The Simple Interest value is: " + simpleInterest);
        
    }
}
