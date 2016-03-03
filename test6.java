package com.jk.temp.model;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		//计算输入年份和月份的天数，包括闰年。
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入年份和月份");
		int year=scanner.nextInt();
		int month=scanner.nextInt();
		if (year%4==0){
			System.out.println("今年是闰年。");
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(year+"年"+month+"月"+"有31天。");
				break;
				
			case 2:
				System.out.println(year+"年"+month+"月"+"有29天。");
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year+"年"+month+"月"+"有30天。");
				break;
				
			default:
				System.out.println("输入的月份有错误。");
				break;
			}
		}
	}

}
