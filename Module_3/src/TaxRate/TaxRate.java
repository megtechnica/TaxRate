package TaxRate;
import java.util.Scanner;
public class TaxRate {

	public static void main(String [] args) { 
		
		// instantiate variables
	      Scanner scnr = new Scanner(System.in);
	      double hourlyWage;
	      int weeklyHours;
	      double grossWeeklySalary;
	      double taxRate;
	      double taxWithHolding;
	      double takeHomePay;
	      final int WEEKLY_LIMIT = 40;
	      
	      // prompt the user for their hourly wage
	   
	      System.out.println("Enter hourly wage: ");
	      hourlyWage = scnr.nextDouble();
	      
	      // prompt the user for how many hours they worked this week

	      System.out.println("Enter how many hours you worked this week: ");
	      weeklyHours = scnr.nextInt();
	      
	      // find the gross weekly salary
	      grossWeeklySalary = hourlyWage * weeklyHours;
	      
	      // determine the tax rate
	      if (grossWeeklySalary < 500) {
	    	  taxRate = 0.10;
	      }
	      else if (grossWeeklySalary < 1500) {
	    	  taxRate = 0.15;
	      }
	      else if (grossWeeklySalary < 2500) {
	    	  taxRate = 0.20;
	      }
	      else {
	    	  taxRate = 0.30;
	      }
	      // calculate the tax withholding and take home pay
	      taxWithHolding = grossWeeklySalary * taxRate;
	      takeHomePay = grossWeeklySalary - taxWithHolding;
	      
	      // output 
	      System.out.println("Gross weekly salary: " + grossWeeklySalary);
	      System.out.println("Tax Withholding: " + taxWithHolding);
	      System.out.println("Takehome Pay: " + takeHomePay);      
	  } 

}
