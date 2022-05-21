package org.len;

public class ContRepl {
	public static void main(String[] args) {
		String s ="Nishakerala24@gmail.com";
		boolean contains = s.contains("gmail");
		System.out.println(contains);
		
		String replace = s.replace("gmail", "yahoo");
		System.out.println(replace);
	}

}
