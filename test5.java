package com.jk.temp.model;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("JAVA的分数是：");
		int java=scanner.nextInt();
		System.out.print("Android的分数是：");
		int Android=scanner.nextInt();
		System.out.print("SQL的分数是：");
		int SQL=scanner.nextInt();
		int maxs = java;
		if (maxs<Android) {
			maxs=Android;
		}
		if (maxs<SQL) {
			maxs=SQL;
		}
		System.out.println("最大的数为："+maxs);
	}
}
