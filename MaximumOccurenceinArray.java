package com.practice;

import java.util.Arrays;

public class MaximumOccurenceinArray {
	
	
	
	public static void main(String[] args) {
		
		//String str = "This is Sarthak Gupta";
		//char[] arr = str.toCharArray();
		
		
		
		//char arr[]= {'a','b','c','a','d','a'};
		
		String str = "moinnnnaaooooo";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		
		
		//int arr[]={1,1,5,2,1,2,2,2,2,2,3,4};
		
		//Arrays.sort(arr);
		
		int count=0, occur=0, num=0, i;
		
		for(i=1; i<arr.length;i++){
			
		if(arr[i-1]==arr[i]){
			count++;
			
			if(count>occur){
				
				occur=count;
				num=arr[i];
				
			}
			
		}
		else{
			count=0;
		}
			
		}
		
		System.out.println(" Highest occring no. is = " + (char)num +  " occurring " + occur + " times ");
		
	
	
	
	
	
	
	
	}

}
