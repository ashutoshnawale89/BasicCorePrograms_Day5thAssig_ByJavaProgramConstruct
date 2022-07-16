package com.fifthdayassignment.program;

public class Largest_NumberUC10 {
	public static void main(String[] args) {
		int num1=78, num2=23, num3=305;
		int greatervalue1=0;
		int greatervalue2=0;

		// CONSIDER THE GRATER VALUE IN "NUM1  &  NUM2"
		if (num1 > num2) {
			greatervalue1=num1;
		} else {
			greatervalue1=num2;
		}

		//  CONSIDER THE GRATER VALUE IN "GRATERVALUE1  &  NUM3"
		if (greatervalue1 > num3) {
			greatervalue2=greatervalue1;
		} else {
			greatervalue2=num3;
		}
		System.out.println("GREATER VALUE IS "+ greatervalue2);




	}
}

}
