package com.practice;

//import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
//import java.util.Scanner;

public class SecondLargestinArray {
	
	/*public static int getSecondLargest(Integer[] a, int total){
		
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(total-2);
		return element;
		}*/
	
	public static void main(String[] args) {
		Integer a[]={11,12,14,15};
		
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		
		System.out.println(list.get(a.length-2));
		
		
		//System.out.println("Second Largest: "+getSecondLargest(a,6));
		
		
		/*Arrays.sort(a);
		
		System.out.println(a[a.length-2]);*/
		
		  
		  

	}

}
