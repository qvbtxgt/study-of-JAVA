package com.jk.temp.model;

public class test7 {

	public static void main(String[] args) {
		//用while语句打印26个字母和对应的unicode编码
		int i = 0;
		while(i<=25){
			System.out.println("字母"+(char)(97+i)+"对应的unicode编码为："+(97+i));
			i+=1;
		}
		
		//使用FOR循环语句实现打印打印26个大字母和对应的unicode编码
		for (int j = 'A'; j <='Z' ; j++) {
			System.out.println("字母"+(char)j+"对应的unicode编码为："+j);
		}
	}

}
