package recursionpractice;

import java.util.Scanner;

public class ReverseStringAnswer {
	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);
		System.out.println("Please enter a String to be reversed: ");
		
		//store the input in a var
		String s = readInput.next();
		
		//modified call to return the index counter starting from the end of the string
		System.out.println(reverseString(s, s.length()-1));
	}
	
	private static String reverseString(String s, Integer i) {
		if(i == 0) {
			return Character.toString(s.charAt(0));//base case, return the first element of the string and stop
		}
		else {
			return Character.toString(s.charAt(i)) + reverseString(s, i-1); 
			//recursive case, return the character at current index followed by the string chain preceding it
		}
	}
}
