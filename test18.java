package com.jk.temp.model;

import java.util.Scanner;

public class test18 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("������");
		String name = scanner.nextLine();
		System.out.print("�Ա�");
		char sex = scanner.next().charAt(1);
		System.out.print("���䣺");
		int age = scanner.nextInt();
		System.out.print("�Ը�");
		String character = scanner.nextLine();
		System.out.print("�ˣ���Һã��ҽ�"+name+"������"+age+"����һ��"+character+sex+"ʿ��");
		
	}

}
