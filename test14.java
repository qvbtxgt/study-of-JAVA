package com.jk.temp.model;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// 根据用户输入的年份，获取该年份的生肖。
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入要查询的年份：");
		int year = scanner.nextInt();
		switch (year%12) {
		case 0:
			System.out.println(year+"年为猴年。");
			break;
		case 1:
			System.out.println(year+"年为鸡年。");
			break;
		case 2:
			System.out.println(year+"年为狗年。");
			break;
		case 3:
			System.out.println(year+"年为猪年。");
			break;
		case 4:
			System.out.println(year+"年为鼠年。");
			break;
		case 5:
			System.out.println(year+"年为牛年。");
			break;
		case 6:
			System.out.println(year+"年为虎年。");
			break;
		case 7:
			System.out.println(year+"年为兔年。");
			break;
		case 8:
			System.out.println(year+"年为龙年。");
			break;
		case 9:
			System.out.println(year+"年为蛇年。");
			break;
		case 10:
			System.out.println(year+"年为马年。");
			break;
		case 11:
			System.out.println(year+"年为羊年。");
			break;

		default:
			System.out.println("输入的年份有错误！");
			break;
		}
	}

}
