package com.jk.temp.model;

public class test20 {

	public static void main(String[] args) {
		int s[]={76,88,57,90,67,89};    //ȡ�����������ֵ����Сֵ
		int max=s[0];
		int min=s[0];
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("s"+i+"�ǣ�"+s[i]);
		}
		for (int j = 0; j < s.length; j++) {
			if (max<s[j]) {
				max=s[j];
			}
		}for (int j = 0; j < s.length; j++) {
			if (min>s[j]) {
				min=s[j];
			}
		}
		System.out.println("���ֵ�ǣ�"+max);
		System.out.println("��Сֵ�ǣ�"+min);
	}

}
