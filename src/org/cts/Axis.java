package org.cts;

import java.util.Scanner;

public class Axis {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("ravi completed his work");
		
		String s="Greens Technology";
		
		String s1="greens technology";
		
		boolean e = s.isEmpty();
		System.out.println(e);
		
		//To find the length 
		
		int l = s.length();
		System.out.println("length is "+l);
		
		//To find the index
		int i = s.indexOf('e');
		System.out.println("index of e is "+i);
		
		//To find the last index
		
		int li = s.lastIndexOf('e');
		System.out.println("last index of e is "+li);
	
		//To find the particular char
		char c = s.charAt(7);
		System.out.println("character at 7th index is "+c);
		
		//To convert into upper case
		String uc = s.toUpperCase();
		System.out.println(uc);
		
		String lc = s.toLowerCase();
		System.out.println(lc);
		
		//To print from particular index
		
		String st = s.substring(4);
		System.out.println(st);
		
		String k = s.substring(4, 13);
		System.out.println(k);
		
        boolean sw = s.startsWith("Gree");
        System.out.println(sw);
        
        boolean ew = s.endsWith("og");
        System.out.println(ew);
        
        boolean co = s.contains("nolo");
        System.out.println(co);
		
        //To check whether two strings are equal or not
		
		boolean eq = s.equals(s1);
		System.out.println("both the strings are equal "+eq);
		
		boolean iq = s.equalsIgnoreCase(s1);
		System.out.println(iq);
		
		
		
		
		
		
		
		
		
}
}