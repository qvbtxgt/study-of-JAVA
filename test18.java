package com.jk.temp.model;

import java.util.Scanner;

public class test18 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("姓名：");
		String name = scanner.nextLine();
		System.out.print("性别：");
		char sex = scanner.next().charAt(1);
		System.out.print("年龄：");
		int age = scanner.nextInt();
		System.out.print("性格：");
		String character = scanner.nextLine();
		System.out.print("嗨，大家好，我叫"+name+"，今年"+age+"，是一个"+character+sex+"士。");
		
	}

}
