package com.jk.temp.model;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("JAVA�ķ����ǣ�");
		int java=scanner.nextInt();
		System.out.print("Android�ķ����ǣ�");
		int Android=scanner.nextInt();
		System.out.print("SQL�ķ����ǣ�");
		int SQL=scanner.nextInt();
		int maxs = java;
		if (maxs<Android) {
			maxs=Android;
		}
		if (maxs<SQL) {
			maxs=SQL;
		}
		System.out.println("������Ϊ��"+maxs);
	}
}
