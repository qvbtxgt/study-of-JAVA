package com.jk.temp.model;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		// 验证用户的登录信息
		Scanner scanner = new Scanner(System.in);
		
		while(true){
		System.out.println("请输入用户登录名：");
		String name = scanner.nextLine();
		System.out.println("请输入登录密码：");
		String code = scanner.nextLine();
		if (!(name.equals("邹敏"))) {
			System.out.println("输入的用户名错误，请重新输入！");
			continue;
		}
		else if (!(code.equals("19721201"))) {
				System.out.println("输入的密码错误，请重新输入！");
				continue;
		}else {
				System.out.println("用户登录成功！");
				break;
		}
	}
		
	}

}
