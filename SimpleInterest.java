//package simpleinterest;

import java.util.Scanner;

public class SimpleInterest {
	
    public static void main(String args[]) {
    	
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Please enter principle amount :");
        float amount = scanner.nextFloat();
      
        System.out.print("Enter number of years deposited: ");
        float time = scanner.nextFloat();
      
        System.out.println("Enter annual interest rate: ");
        float rate = scanner.nextFloat();
      
        float interest = simpleInterest(amount, rate, time);
      
        System.out.println("Simple interest: " + interest);

        float finalAmount = amount + interest;
        
        System.out.println("Final Amount: " + finalAmount);
    }
  
    public static float simpleInterest(float principle, float rate, float time){
        float interest = (principle*rate*time)/100;
        return interest;
    }
}