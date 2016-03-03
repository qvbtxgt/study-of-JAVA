package com.jk.temp.model;

public class test25 {

	public static void main(String[] args) {
		// StringBuffer
		StringBuffer s=new StringBuffer();
		s.append("hello world.");
		System.out.println(s);
		tell(s);
		System.out.println();
		System.out.println(s);
	}
	public static void tell(StringBuffer a) {
		a.append("I love code.");
	}
}
