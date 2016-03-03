package com.jk.temp.main;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		int i = 4;
		float f=9.5f;
		f*=i;        //系统自动类型转换为float
		
		double d1=4.88;
		double d2=78.83;
		int d3=(int) (d1+d2);
		int d4=(int)d1+(int)d2;   //强制类型转换double为int
		System.out.println("d3:"+d3+"="+d1+"+"+d2);
		System.out.println("d4:"+d4+"="+(int)d1+"+"+(int)d2);
		
		char c=65;          //int与char类型之间的可以自动转换
		int e='A';
		System.out.println(c+":"+e);
		int a=4>=4?1:0;
		System.out.println(a);
		
		//求长方形的面积
		Scanner scanner=new Scanner(System.in);
		System.out.print("长为：");
		int l=scanner.nextInt();
		System.out.print("宽为：");
		int w=scanner.nextInt();
		int s = l*w;
		System.out.println("长方形的面积为：长乘宽＝"+s);
		}

}
