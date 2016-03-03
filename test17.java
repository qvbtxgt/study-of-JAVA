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
		System.out.print("姓名：");
		String name = scanner.next();
		System.out.println("姓名："+name);
		
		System.out.println("成绩是：");
		int score = scanner.nextInt();
		boolean ispass = score>=60;
		System.out.println("成绩"+score+"合格:"+ispass);
		
	}

}
