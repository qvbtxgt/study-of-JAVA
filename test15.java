package com.jk.temp.model;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		// ��֤�û��ĵ�¼��Ϣ
		Scanner scanner = new Scanner(System.in);
		
		while(true){
		System.out.println("�������û���¼����");
		String name = scanner.nextLine();
		System.out.println("�������¼���룺");
		String code = scanner.nextLine();
		if (!(name.equals("����"))) {
			System.out.println("������û����������������룡");
			continue;
		}
		else if (!(code.equals("19721201"))) {
				System.out.println("���������������������룡");
				continue;
		}else {
				System.out.println("�û���¼�ɹ���");
				break;
		}
	}
		
	}

}
