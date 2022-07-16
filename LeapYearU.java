package com.fifthdayassignment.program;

public class Leap_YearUC2 {
	public static void main(String[] args) { 
		int year=2019;
		if (year%100!=0 && year%4==0 ){
			System.out.println("LEAP YEAR");
		}else{
			System.out.println("NOT LEAP YEAR");
		}


	}
}
