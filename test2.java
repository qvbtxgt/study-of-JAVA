package com.jk.temp.main;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		int i = 4;
		float f=9.5f;
		f*=i;        //ϵͳ�Զ�����ת��Ϊfloat
		
		double d1=4.88;
		double d2=78.83;
		int d3=(int) (d1+d2);
		int d4=(int)d1+(int)d2;   //ǿ������ת��doubleΪint
		System.out.println("d3:"+d3+"="+d1+"+"+d2);
		System.out.println("d4:"+d4+"="+(int)d1+"+"+(int)d2);
		
		char c=65;          //int��char����֮��Ŀ����Զ�ת��
		int e='A';
		System.out.println(c+":"+e);
		int a=4>=4?1:0;
		System.out.println(a);
		
		//�󳤷��ε����
		Scanner scanner=new Scanner(System.in);
		System.out.print("��Ϊ��");
		int l=scanner.nextInt();
		System.out.print("��Ϊ��");
		int w=scanner.nextInt();
		int s = l*w;
		System.out.println("�����ε����Ϊ�����˿�"+s);
		}

}
