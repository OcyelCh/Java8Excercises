package rotate_string;

import java.util.Scanner;

public class RotateString {

	public static Scanner r=new Scanner(System.in);
	
	public static void main(String[] args) {
		solutionJava7();
	}
	

	private static void solutionJava7() {
		// TODO Auto-generated method stub
		System.out.println("Please, enter the number of rotations");
		int n=r.nextInt();
		r.nextLine();
		System.out.println("Please, enter the string that will be rotated");
		String s=r.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println(rotateAntiClock(s, i));
		}
	}
	
	public static String rotateAntiClock(String s, int i) {
		// TODO Auto-generated method stub
			int x = s.length()-i;
			if(x<0)
				x=s.length()-Math.abs(x);
		  return s.substring(x) + s.substring(0, x);
		}

}
