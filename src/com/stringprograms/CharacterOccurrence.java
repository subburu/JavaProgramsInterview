package com.stringprograms;

public class CharacterOccurrence {

	public static void main(String args[]) {

		CharOccurrence("Sravan Kumar", 'K');
		CharOccurrenc("Sravan Kumar", 'a');

	}

	public static void CharOccurrence(String S, char val) {
		int count = 0;
		char arr[] = S.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				count++;
				
			}
		}
		System.out.println("Occurence of  " + val + " " + count);
	}

	public static void CharOccurrenc(String input, char val) {
		int count = 1;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == val) {
			
	          input= input.replaceFirst(String.valueOf(input.charAt(i)),String.valueOf(count) );
	           count++;
			}
		}
		System.out.println("Replacement occurence " + input);
	}
	
	
	
	
}
