package com.jk.temp.model;

import javax.naming.spi.DirStateFactory.Result;

public class test1 {
	/**
	 * (sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))
	 */
	
	public static void main(String[] args) {
		String  name = "����";      //������������main����      
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

		name = "�ŷ�";         //�������ǵڶ�����������
		short age = 35;
		float height = 1.80f;
		String sex = "��";
		String feature = "���ŵ�";
		System.out.println("�ˣ���Һã��ҽ�"+name+"������"+age+"�꣬����һ��"+feature+sex+"ʿ");
		
		name = "����";         //�������ǵڶ�����������
		age = 30;
		height = 1.60f;
		sex = "Ů";
		feature = "�����";
		System.out.println("�ˣ���Һã��ҽ�"+name+"������"+age+"�꣬����һ��"+feature+sex+"ʿ");
		
		}
		name = "����";          //������������main����
		System.out.println(name);
		int a = Byte.MAX_VALUE;
		int b = Byte.MIN_VALUE;
		int c = a-b+1;
		byte d = Byte.parseByte("123");
		System.out.println("Byte��ȡֵ��ΧΪ0~"+c+"�����ֵ�ǣ�"+a+"����Сֵ�ǣ�"+b);
		System.out.println(d);
		
		byte b1=5;
		int b2=129+3;
		System.out.println(b2);
	}

}
