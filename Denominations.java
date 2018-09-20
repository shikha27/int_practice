package com.practice;

import java.util.Scanner;

public class Denominations {

	public static void main(String[] args) {
		
		int amt, r1000=0, r500=0, r100=0, r50=0, r20=0, r10=0, r5=0, r2=0, r1=0, count=0;
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the amt");
		
		amt=sc.nextInt();
		
		while(amt>=1000){
			r1000=amt/1000;
			amt=amt%1000;
			System.out.println("total no. of 1000 rupees notes:"+ r1000);
			break;
			
		}

		
		while(amt>=500){
			r500=amt/500;
			amt=amt%500;
			System.out.println("total no. of 500 rupees notes:"+r500);
			break;
			
		}
		
		
		while(amt>=100){
			r100=amt/100;
			amt=amt%100;
			System.out.println("total no. of 100 rupees notes:"+r100);
			break;
			
		}
		
		
		while(amt>=50){
			r50=amt/50;
			amt=amt%50;
			System.out.println("total no. of 50 rupees notes:"+r50);
			break;
			
		}
		
		while(amt>=20){
			r20=amt/20;
			amt=amt%20;
			System.out.println("total no. of 20 rupees notes:"+r20);
			break;
			
		}
		
		while(amt>=10){
			r10=amt/10;
			amt=amt%10;
			System.out.println("total no. of 10 rupees notes:"+r10);
			break;
			
		}
		
		while(amt>=5){
			r5=amt/5;
			amt=amt%5;
			System.out.println("total no. of 5 rupees notes:"+r5);
			break;
			
		}
		
		while(amt>=2){
			r2=amt/2;
			amt=amt%2;
			System.out.println("total no. of 2 rupees notes:"+r2);
			break;
			
		}
		
		while(amt>=1){
			r1=amt/1;
			amt=amt%1;
			System.out.println("total no. of 1 rupees notes:"+r1);
			break;
			
		}
		
		count=r1000+r500+r100+r50+r20+r10+r5+r2+r1;
		
		System.out.println("total no. of notes:"+count);
		
	}

}
