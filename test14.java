package com.jk.temp.model;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// �����û��������ݣ���ȡ����ݵ���Ф��
		Scanner scanner=new Scanner(System.in);
		System.out.println("������Ҫ��ѯ����ݣ�");
		int year = scanner.nextInt();
		switch (year%12) {
		case 0:
			System.out.println(year+"��Ϊ���ꡣ");
			break;
		case 1:
			System.out.println(year+"��Ϊ���ꡣ");
			break;
		case 2:
			System.out.println(year+"��Ϊ���ꡣ");
			break;
		case 3:
			System.out.println(year+"��Ϊ���ꡣ");
			break;
		case 4:
			System.out.println(year+"��Ϊ���ꡣ");
			break;
		case 5:
			System.out.println(year+"��Ϊţ�ꡣ");
			break;
		case 6:
			System.out.println(year+"��Ϊ���ꡣ");
			break;
		case 7:
			System.out.println(year+"��Ϊ���ꡣ");
			break;
		case 8:
			System.out.println(year+"��Ϊ���ꡣ");
			break;
		case 9:
			System.out.println(year+"��Ϊ���ꡣ");
			break;
		case 10:
			System.out.println(year+"��Ϊ���ꡣ");
			break;
		case 11:
			System.out.println(year+"��Ϊ���ꡣ");
			break;

		default:
			System.out.println("���������д���");
			break;
		}
	}

}
