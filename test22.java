package com.jk.temp.model;

public class test22 {

	public static void main(String[] args) {
		// ����ά�����е����л�������ʾ����
		int s[][]={{1,4,7},{2,5,8},{3,6,9}};
		int t[][]=new int[3][3];
		//�����ԭ��ά����
		System.out.println("ԭ��ά���飺");
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]+"\t");
			}
			System.out.println();
		}
		//�Զ�ά��������н��л�����������ʾ����
		System.out.println("���л�����");
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				t[i][j]=s[j][i];
				System.out.print(t[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
