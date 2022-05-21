package org.len;

public class NonLiteral {
	public static void main(String[] args) {
		String a =new String("Nisha");
		String b =new String("Rengan");
		String c =new String("NishaRengan");
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		System.out.println(c);
		System.out.println(System.identityHashCode(c));
	}

}
