package com.jk.temp.model;

public class test20 {

	public static void main(String[] args) {
		int s[]={76,88,57,90,67,89};    //取出数组中最大值和最小值
		int max=s[0];
		int min=s[0];
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("s"+i+"是："+s[i]);
		}
		for (int j = 0; j < s.length; j++) {
			if (max<s[j]) {
				max=s[j];
			}
		}for (int j = 0; j < s.length; j++) {
			if (min>s[j]) {
				min=s[j];
			}
		}
		System.out.println("最大值是："+max);
		System.out.println("最小值是："+min);
	}

}
