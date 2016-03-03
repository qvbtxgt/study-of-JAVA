package com.jk.temp.model;

public class test22 {

	public static void main(String[] args) {
		// 将二维数组中的行列互调并显示出来
		int s[][]={{1,4,7},{2,5,8},{3,6,9}};
		int t[][]=new int[3][3];
		//先输出原二维数组
		System.out.println("原二维数组：");
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]+"\t");
			}
			System.out.println();
		}
		//对二维数组的行列进行互调，并且显示出来
		System.out.println("行列互调后：");
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				t[i][j]=s[j][i];
				System.out.print(t[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
