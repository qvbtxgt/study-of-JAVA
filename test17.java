package com.jk.temp.model;

import java.util.Scanner;

public class test17 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));

		Scanner scanner=new Scanner(System.in);
		System.out.print("������");
		String name = scanner.next();
		System.out.println("������"+name);
		
		System.out.println("�ɼ��ǣ�");
		int score = scanner.nextInt();
		boolean ispass = score>=60;
		System.out.println("�ɼ�"+score+"�ϸ�:"+ispass);
		
	}

}
