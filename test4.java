package com.jk.temp.model;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("用5分制打分：");
		int score=scanner.nextInt();       //采用IF语句实现
		if (score==5) {
			System.out.println(score+"优秀");
		}else if (score==4) {
			System.out.println(score+"良好");
		}else if (score==3) {
			System.out.println(score+"合格");
		}else if (score>=0 && score<=2) {
			System.out.println(score+"不合格");
		}else {
			System.out.println("输入的不是5分制。");
		}
		
		
		System.out.print("用5分制打分：");    //采用switch语句实现
		int s=scanner.nextInt();
		switch (s) {
		case 5:
			System.out.println(s+"优秀");
			break;
		case 4:
			System.out.println(s+"良好");
			break;
		case 3:
			System.out.println(s+"合格");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println(s+"不合格");
			break;
		default:
			System.out.println("输入的不是5分制。");
			break;
		}
		
		
		System.out.println("输入分数等级：");
//		String st=scanner.next();
		char grade=scanner.next().charAt(0);  //记住这种char类型的输入方式
		switch (grade) {
		case '优':
			System.out.println("分数为5分");
			break;
		case '良':
			System.out.println("分数为4分");
			break;
		case '中':
			System.out.println("分数为3分");
			break;
		case '差':
			System.out.println("分数为2分");
			break;
		default:
			System.out.println("输入的等级不对！");
			break;
		}
	}
}
