package print_vowel;

import java.util.Scanner;

public class PrintThirdVowel {

	public static Scanner r=new Scanner(System.in);

	public static void main(String[] args) {
		solutionJava7();
	}

	private static void solutionJava7() {
		// TODO Auto-generated method stub
		int p = 3;
		System.out.println("Enter the string that will be analyzed");
		String s = r.nextLine();
		vowels(p,s);
	}

	private static void vowels(int p, String s) {
		// TODO Auto-generated method stub
		int x=-1;
		do
		{
			if(((x+p)>s.length()-1))
			{
				System.out.println("The next characters will be deprecated due to the length of the string");
				for(x=x+1; x<s.length();x++)
				{
					System.out.print(s.charAt(x));
				}
				System.out.println();
			}
			else
			{
				x = x+p;
				if(s.charAt(x)=='a'||s.charAt(x)=='e'||s.charAt(x)=='i'||s.charAt(x)=='o'||s.charAt(x)=='u')
					{
					System.out.println(s.charAt(x)+" ");
					}	
			}
			
		}while(x<s.length());
		
		
	}
	
}
