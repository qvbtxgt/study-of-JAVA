package com.jk.temp.model;

public class test8 {

	public static void main(String[] args) {
		//ʹ��forѭ������100������ż��֮��
		int s = 0;
		for (int i=0;i<=100;i+=2) {
			s+=i;
		}
		System.out.println("100������ż���ĺ�Ϊ��"+s);
		
		//ʹ��forѭ�����14��98�����й�Լ��
		for (int j = 1; j <=14; j++) {
			if (14%j==0 && 98%j==0){
				System.out.println(j+"Ϊ14��98�Ĺ�Լ����");
			}
		}
	}

}
