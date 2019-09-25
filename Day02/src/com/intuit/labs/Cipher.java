package com.intuit.labs;

import java.util.HashMap;
import java.util.Map;

public class Cipher {

	private boolean isSimple;
	private Map complexStore = new HashMap();

	public Cipher() {
		isSimple = true;
	}
	public Cipher(boolean isSimpleCipher) {
		isSimple = isSimpleCipher;
	}

	public String encrypt(String word) {
		String result = null;
		if(isSimple) {
			result = encryptSimpleWay(word);
		}
		else {
			result = encryptComplexWay(word);
		}
		return result;
	}

	public String decrypt(String word) {
		String result = null;
		if(isSimple) {
			result = decryptSimpleWay(word);
		}
		else {
			result = decryptComplexWay(word);
		}
		return result;
	}

	private String decryptComplexWay(String decryptedWord) {
		String originalWord = (String)complexStore.get(decryptedWord);
		return originalWord;
	}
	private String decryptSimpleWay(String word) {
		String decrypted = "";
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			letter--;
			decrypted += letter;
		}
		return decrypted;
	}
	private String encryptComplexWay(String word) {
		String encrypted = "";
		String[] letters = word.split("");
		int count = letters.length - 1;
		while(count >= 0) {
			int randomIndex = (int)(Math.random() * letters.length);
			if(letters[randomIndex] != null) {
				encrypted += letters[randomIndex];
				letters[randomIndex] = null;
				count--;
			}

		}
		//"elloh"->"hello"
		complexStore.put(encrypted, word);
		return encrypted;
	}

	private String encryptSimpleWay(String word) {
		String encrypted = "";
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			letter++;
			encrypted += letter;
		}
		return encrypted;
	}


}








