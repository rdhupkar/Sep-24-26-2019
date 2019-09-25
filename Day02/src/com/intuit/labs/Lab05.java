package com.intuit.labs;

public class Lab05 {

	public static void main(String[] args) {
		Cipher simple = new Cipher();
		String simpleEncryptedWord = simple.encrypt("hello");
		System.out.println("Encrypted simple: " + simpleEncryptedWord);
		System.out.println("Decrypted simple: " + simple.decrypt(simpleEncryptedWord));
		
		
		Cipher complex = new Cipher(false);
		String complexEncryptedWord = complex.encrypt("hello");
		System.out.println("Encrypted complex: " + complexEncryptedWord);
		System.out.println("Decrypted complex: " + complex.decrypt(complexEncryptedWord));
	}

}
