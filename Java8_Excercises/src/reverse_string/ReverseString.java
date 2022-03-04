package reverse_string;

import java.util.Scanner;

public class ReverseString {

	public static Scanner r=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString();
	}

	private static void reverseString() {
		// TODO Auto-generated method stub
		System.out.println("Please, enter a String");
		String normalString=r.nextLine();
		String reversedString = normalString.chars().mapToObj(characters -> (char)characters).reduce("", (string,chars) -> chars+string, (characterString,resultingString) -> resultingString+characterString);
		System.out.println("Reversed string: "+reversedString);
	}

}
