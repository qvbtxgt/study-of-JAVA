package com.jk.temp.model;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		//����������ݺ��·ݵ��������������ꡣ
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ݺ��·�");
		int year=scanner.nextInt();
		int month=scanner.nextInt();
		if (year%4==0){
			System.out.println("���������ꡣ");
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(year+"��"+month+"��"+"��31�졣");
				break;
				
			case 2:
				System.out.println(year+"��"+month+"��"+"��29�졣");
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year+"��"+month+"��"+"��30�졣");
				break;
				
			default:
				System.out.println("������·��д���");
				break;
			}
		}
	}

}
