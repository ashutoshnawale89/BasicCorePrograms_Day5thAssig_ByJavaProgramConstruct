package com.fifthdayassignment.program;

public class Flip_CoinUC1 {
	public static void main(String[] args) { 
       
		double num=(Math.random());
        
    	if (Math.random() < 0.5){
    		
        System.out.println("Heads");
            }
    	else
         System.out.println("Tails");
            }
    	
    	System.out.println("Percentage of turnout COIN is "+ num*100 +"%");
    }
}
