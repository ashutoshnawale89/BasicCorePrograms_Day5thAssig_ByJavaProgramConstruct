package com.fifthdayassignment.program;

public class FactorsUC5 {
	public static void main(String[] args) { 
	       int number=25;
	       System.out.println("number is "+ number);
	       
	       for (int i=1; i <= number; i++) {
	    	   if (number%i==0) {
	    		   System.out.println("IT FACTORS BY "+ i);
	    	   }
	       }
		}
}
