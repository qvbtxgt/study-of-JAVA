package com.jk.temp.model;

public class test21 {

	public static void main(String[] args) {
		// ð�����򷨣������ǰ�棬С���ź���
		int s[]={5,1,25,75,4,0,7,53,9};
//		int temp=0;
		for (int i = 0; i <= s.length-1; i++) {
			for (int j = i+1; j < s.length; j++) {
				if (s[i]<s[j]) {
					s[i]=s[i]+s[j];   //������������������������
					s[j]=s[i]-s[j];
					s[i]=s[i]-s[j];
				}
			}
			System.out.println("��"+(i+1)+"������");
			for (int k = 0; k < s.length; k++) {
				System.out.print(s[k]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("�����");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+"\t");
		}
		
	}

}
