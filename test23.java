package com.jk.temp.model;

public class test23 {

	public static void main(String[] args) {
		// ֱ��ѡ������
		int a[]={5,1,25,75,4,0,7,53,9};
		int temp=0;
		System.out.println("ԭ���飺");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		//ֱ��ѡ���������з�
		int index=0;
		for (int i = 1; i < a.length-1; i++) {
			index = 0;
			for (int j = 1; j <= a.length-i; j++) {
				if (a[j]>a[index]) {       //ͨ����a[index]��ֵ���бȽϣ��������Ǹ������±긳��index
					index=j;               //
				}
			}
			temp=a[a.length-i];
			a[a.length-i]=a[index];
			a[index]=temp;
			
			for (int k = 0; k < a.length; k++) {
				System.out.print(a[k]+"\t");
			}
			System.out.println();
		}
		String str="Hello";
		str=str+"world";
		
		int b[]={5,1,25,75,4,0,7,53,9};
		temp=0;
		System.out.println("ԭ���飺");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println();
		
		for (int i = 1; i <b.length-1; i++) {
			index=i-1;
			for (int j = i; j <=b.length-1; j++) {
				if (b[index]>b[j]) {
					index=j;
				}
			}
			temp=b[i-1];
			b[i-1]=b[index];
			b[index]=temp;
			
			for (int k = 0; k < b.length; k++) {
				System.out.print(b[k]+"\t");
			}
			System.out.println();
		}
	}

}
