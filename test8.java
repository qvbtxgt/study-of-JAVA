package com.jk.temp.model;

public class test8 {

	public static void main(String[] args) {
		//使用for循环计算100内所有偶数之和
		int s = 0;
		for (int i=0;i<=100;i+=2) {
			s+=i;
		}
		System.out.println("100内所有偶数的和为："+s);
		
		//使用for循环输出14和98的所有公约数
		for (int j = 1; j <=14; j++) {
			if (14%j==0 && 98%j==0){
				System.out.println(j+"为14和98的公约数。");
			}
		}
	}

}
