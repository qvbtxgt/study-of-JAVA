package com.jk.temp.model;

import javax.naming.spi.DirStateFactory.Result;

public class test1 {
	/**
	 * (sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))
	 */
	
	public static void main(String[] args) {
		String  name = "李四";      //作用域是整个main函数      
		System.out.println(name);
		
		{
			double s20=Math.sqrt(20);
		double s10=Math.sqrt(10);
		double r=(s20+s10)/(s20-s10);
//		double r1=Math.sqrt(20)+Math.sqrt(10);
//		double r2=Math.sqrt(20)-Math.sqrt(10);
//		double r3 = Math.round(r1/r2*10)/10.0;
		double result1 = Math.round(r*10)/10.0;
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+result1);

		name = "张飞";         //作用域是第二个大括号内
		short age = 35;
		float height = 1.80f;
		String sex = "男";
		String feature = "豪放的";
		System.out.println("嗨，大家好，我叫"+name+"，今年"+age+"岁，俺是一个"+feature+sex+"士");
		
		name = "王非";         //作用域是第二个大括号内
		age = 30;
		height = 1.60f;
		sex = "女";
		feature = "温柔的";
		System.out.println("嗨，大家好，我叫"+name+"，今年"+age+"岁，俺是一个"+feature+sex+"士");
		
		}
		name = "张三";          //作用域是整个main函数
		System.out.println(name);
		int a = Byte.MAX_VALUE;
		int b = Byte.MIN_VALUE;
		int c = a-b+1;
		byte d = Byte.parseByte("123");
		System.out.println("Byte的取值范围为0~"+c+"，最大值是："+a+"，最小值是："+b);
		System.out.println(d);
		
		byte b1=5;
		int b2=129+3;
		System.out.println(b2);
	}

}
