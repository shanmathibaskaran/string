package org.len;

public class Literal {
	public static void main(String[] args) {
		String s ="Nisha";
		String a ="Nisha";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
	}

}
