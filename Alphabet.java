package com.fifthdayassignment.program;

public class AlphabetUC9 {
	public static void main(String[] args) {

        char ch ='A';  // PUT THE APHABETS IN SINGLE WORD

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
