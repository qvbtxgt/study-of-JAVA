package com.jk.temp.model;

public class test13 {

	public static void main(String[] args) {
		// 计算素数
//		System.out.println((int)Math.sqrt(5));
		int n=2;
		int num=1;
		while(num<=40){              //是否输出40个素数了？
			boolean issushu=true;    //是素数？
			for (int i = 2; i <= n/2; i++) {
				if (n%i==0) {        
					issushu=false;
					break;
				}}
			if (issushu) {
				System.out.print(n+"\t");
				if(num%10==0){
					System.out.println('\n');
				}
				num++;
			}
			
			n++;
			}
		}
		
	}


