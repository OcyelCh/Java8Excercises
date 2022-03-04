package palindrome;

import java.util.Scanner;

public class PalindromeString {
	
	public static Scanner r=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, enter a String");
		String normalString=r.nextLine();
		String noSpaces=normalString.replaceAll(" ", "");
		String palindrome=reversedString(noSpaces);
		if(noSpaces.equals(palindrome))
			System.out.println("It's a palindrome: "+palindrome);
		else
			System.out.println("It's not a palindrome: "+palindrome);
	}

	private static String reversedString(String noSpaces) {
		// TODO Auto-generated method stub
		return noSpaces.chars().mapToObj(characters -> (char)characters).reduce("", (string,chars) -> chars+string, (characterString,resultingString) -> resultingString+characterString);
	}

}
