package com.jk.temp.model;

import org.omg.CORBA.PUBLIC_MEMBER;

public class test12 {

	public static void main(String[] args) {
		System.out.print('\u90b9'+":");
		System.out.println(9*Math.pow(16, 3)+11*Math.pow(16, 1)+9);
		System.out.println((char)37049+":"+37049);
		System.out.println("我和\n你不在一行哟。");
		System.out.print("\t我在这里哟。\n");
		System.out.println("System.out.println(\"双引号也显示出来啦。\")");
		
		boolean ispass= true;
		System.out.println("考试通过："+ispass);
		ispass = false;
		System.out.println("考试通过："+ispass);
		ispass = 70>=65;
		System.out.println("分数大于65："+ispass);
		
		int i = -3;
		long l=i;
		System.out.println("i:"+Integer.toBinaryString(i));
		System.out.println("l:"+Long.toBinaryString(l));

		
		i = 0x10000001;
		float j=i;
		System.out.println("i:"+Integer.toBinaryString(i)+":"+i);
		System.out.println("j:"+Integer.toBinaryString((int)j)+":"+j);
		System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		
		long k=0x30000000000011l;
		double n=k;
		System.out.println("k:"+Long.toBinaryString(k)+":"+k);
		System.out.println("n:"+Long.toBinaryString((long)n)+":"+n);
	}

}
