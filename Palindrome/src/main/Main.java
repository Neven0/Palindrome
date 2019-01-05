package main;

import java.util.Scanner;

public class Main {
	
	public static String Palindrom(String s) {
		char[] chars=new char[s.length()];
		s=s.toLowerCase();
		chars=s.toCharArray();
		for(int i=0; i<s.length()/2;i++) {
			char temp=chars[i];
			chars[i]=chars[s.length()-1-i];
			chars[s.length()-1-i]=temp;
		}
		String palind=new String(chars);
		return palind;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		String odgovor="y";
		while(odgovor.equals("y")) {
		System.out.println("Enter your word>>");
		String unoseno=unos.next();
		String palind=Palindrom(unoseno);
		if(unoseno.toLowerCase().equals(palind)) {
			System.out.println("Your word is a palindrome!");
		}
		else {
			System.out.println("Your word is not a palindrome. From word "+unoseno+", reversed word is "+palind);
		}
		System.out.println("Do you want to try another word [y/n]?");
		odgovor=unos.next();
		if(!odgovor.equals("y")) {
			System.out.println("Goodbye");
			unos.close();
		}
		}
			
		}

	}
