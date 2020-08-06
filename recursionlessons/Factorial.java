package recursion;

import java.util.Scanner;

public class Factorial {
	/*Created by Kaif Jeelani
	 * 
	 * In this lesson, we will be learning about Linear Recursion.
	 * 
	 * This is the simplest type of recursion, where each function call results in one more function call
	 * until a base cased is reach
	 * 
	 * This will be demonstrated by creating code to finding N! given N
	 * 
	 * N! represents n factorial. The sequence is like this: 1! = 1 , 2! = 2*1 , 3! = 3*2*1 and so on
	 * 
	 * Where the product is found using the formula n*(n-1)*(n-2)...*1
	 * 
	 * Linear Recursion can ALWAYS be modeled by iteration(using loops), so we will show you how both algorithms work
	 * 
	 * Try to to solve a recursion problem by creating a recursive function to return the reverse of a string
	 */
	
	public static void main(String[] args) {
		//read input from user
		Scanner readInput = new Scanner(System.in);
		System.out.println("This program will find N!. Please enter N:");
		
		Integer N = readInput.nextInt();
		
		//Print the result
		Integer recursive_answer = findFactorialRecursive(N);
		Integer iterative_answer = findFactorialIterative(N);

		System.out.println(recursive_answer.toString());
		System.out.println(iterative_answer.toString());
		
		readInput.close();
	}
	/*n=4*/
	private static Integer findFactorialIterative(Integer n) {
		//We take n and find the n! using iteration

		Integer product = 1;//this is our base
		for(Integer i = 1; i <= n; i++) {
			//for every i until i is greater than n, we multiply it to product. To better understand this, look at the tracing below
			product *= i;
		}
		
		return product;
	}

	private static Integer findFactorialRecursive(int n) {
		//We take n and find the n! using linear recursion

		//base case(every recursion statement should have this. It indicates when we should stop the recursion)
		if(n == 1) {
			return 1;
		}
		else {
			//Here is our recursive statement. A good way to comprehend this is to trace it. We do so down below
			return n * findFactorialRecursive(n-1);
		}
	}
	
	/*
	 Iterative: Let's call findFactorialIterative(4). We start with product being 1, and i being 1. We multiply
	 product by 1(product=1), and then by 2(product=2), and then 3(product=6), and finally 4(product=24). 
	 Therefore 4!=24.
	 
	 Recursive: Let's call findFactorialRecursive(4). This results in 4*findFactorial(3), which results in
	 4*(3*findFactorial(2)), which results in 4*(3*(2*findFactorial(1))), which finally results in 4*3*2*1 = 24
	 because we reached our base case. Therefore 4!=24.
	 
	*/
}
