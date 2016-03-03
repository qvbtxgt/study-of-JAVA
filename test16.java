package com.jk.temp.model;

public class test16 {

	public static void main(String[] args) {
		// 
		int x = 1;
		int s = 0;
		while(x<10){
			s+=++x;
			System.out.println(s+"="+s+"+"+x);
		
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 3*(5-i); j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println("**********");
		}
		
		
		//Êä³öÐÇºÅ
		for (int k = 0; k <9; k++) {
			for (int m = 0; m < k-5; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int k = 5; k >0; k--) {
			for (int m = k; m >0; m--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
