package com.jk.temp.model;

public class test7 {

	public static void main(String[] args) {
		//��while����ӡ26����ĸ�Ͷ�Ӧ��unicode����
		int i = 0;
		while(i<=25){
			System.out.println("��ĸ"+(char)(97+i)+"��Ӧ��unicode����Ϊ��"+(97+i));
			i+=1;
		}
		
		//ʹ��FORѭ�����ʵ�ִ�ӡ��ӡ26������ĸ�Ͷ�Ӧ��unicode����
		for (int j = 'A'; j <='Z' ; j++) {
			System.out.println("��ĸ"+(char)j+"��Ӧ��unicode����Ϊ��"+j);
		}
	}

}
