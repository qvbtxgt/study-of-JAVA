package com.jk.temp.model;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("��5���ƴ�֣�");
		int score=scanner.nextInt();       //����IF���ʵ��
		if (score==5) {
			System.out.println(score+"����");
		}else if (score==4) {
			System.out.println(score+"����");
		}else if (score==3) {
			System.out.println(score+"�ϸ�");
		}else if (score>=0 && score<=2) {
			System.out.println(score+"���ϸ�");
		}else {
			System.out.println("����Ĳ���5���ơ�");
		}
		
		
		System.out.print("��5���ƴ�֣�");    //����switch���ʵ��
		int s=scanner.nextInt();
		switch (s) {
		case 5:
			System.out.println(s+"����");
			break;
		case 4:
			System.out.println(s+"����");
			break;
		case 3:
			System.out.println(s+"�ϸ�");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println(s+"���ϸ�");
			break;
		default:
			System.out.println("����Ĳ���5���ơ�");
			break;
		}
		
		
		System.out.println("��������ȼ���");
//		String st=scanner.next();
		char grade=scanner.next().charAt(0);  //��ס����char���͵����뷽ʽ
		switch (grade) {
		case '��':
			System.out.println("����Ϊ5��");
			break;
		case '��':
			System.out.println("����Ϊ4��");
			break;
		case '��':
			System.out.println("����Ϊ3��");
			break;
		case '��':
			System.out.println("����Ϊ2��");
			break;
		default:
			System.out.println("����ĵȼ����ԣ�");
			break;
		}
	}
}
