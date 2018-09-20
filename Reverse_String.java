package com.practice;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		//String input="My name is shikha";
		
		
		Scanner scan = new Scanner(System.in);
		//String  = scan.next();
		String input = scan.next();
		
		StringBuilder sb= new StringBuilder();
		sb.append(input);
		sb= sb.reverse();
     System.out.println(sb);
     
	}

}
