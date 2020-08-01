package recursion;

import java.util.Scanner;
/*
 * In this lesson, we will be learning about Binomial Recursion.
 * 
 * This is a more complicated version of recursion in which each call results in two more calls
 * 
 * Therefore, what this means is that if a normal recursion would take N amount of calls, binomial recursion would
 * take 2**N calls(2 to the power of N)
 * 
 * This will be demonstrated by creating code to find the Nth term of the Fibonacci sequence
 * 
 * It goes like this: 0, 1, 1, 2, 3, 5, 8, 13, 21...
 * 
 * Where the nth term is found by adding the n-1th term and the n-2th term together. The starting two numbers of
 * this sequence are always 0 and 1.
 * 
 * For example, to find 13, we would need to add the previous element 8 to the element before that 5
 * 
 */

public class Fibonacci {
	public static void main(String[] args) {
		//read input from user
		Scanner readInput = new Scanner(System.in);
		System.out.println("This program will find the Nth term of the Fibonacci Sequence. Please enter N: ");
		
		//Print the result
		Integer nTerm = findNthTerm(readInput.nextInt());
		System.out.println(nTerm.toString());
	}

	private static Integer findNthTerm(Integer n) {
		//We take n and find the nth term of the Fibonacci sequence using binomial recursion
		
		//base cases(every recursion statement should have these
		if(n == 2) {
			//the 2nd term will always be 1
			return 1;
		}
		else if(n == 1){
			//the 1st term will always be 0
			return 0;
		}
		else {
			//Here is our recursive statement. A good way to comprehend this is to trace it. We do so down below
			return findNthTerm(n-1) + findNthTerm(n-2);
		}
		
		/*Let's call findNthTerm(4). This splits up into findNthTerm(3) + findNthTerm(2). findNthTerm(3) splits up
		 into findNthTerm(2) + findNthTerm(1). All together, this is 2*findNthTerm(2) + findNthTerm(1) = 2. Looking
		 at the sequence on line 14, this is indeed the case. Try it yourself!
		*/
	}
}
