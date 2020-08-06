package recursionpractice;

import java.util.Scanner;

/**
 * 
 *Note: There is a more efficient way to do this that does requires neither recursion nor iteration(but we didn't
 *ask for that). See if you can think of a way to do so
 *
 */

public class CoinsAnswer {
	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);
		System.out.println("Enter cents: ");
		
		/*We add an extra parameter 0 to initalize the amount of coins*/
		System.out.println(minimumCoins(readInput.nextInt(), 0));
	}
	
	private static Integer minimumCoins(Integer cents, Integer coins) {
		if(cents >= 25) {
			return minimumCoins(cents - 25, coins + 1);//we convert 25 cents to one coin
		}
		else if(cents >= 10) {
			return minimumCoins(cents - 10, coins + 1);//we convert 10 cents to one coin
		}
		else if(cents >= 5) {
			return minimumCoins(cents - 5, coins + 1);//we convert 5 cents to one coin
		}
		else {
			return cents + coins;//base case(when all of our cents are pennies, we just return current coins + pennies
		}
	}
	
	/*Here is a trace example: minimumCoins(34, 0) will results in minimumCoins(34-25=9, 0+1=1), which will result in
	minimumCoins(9-5=4, 1+1=2), which finally results in 4+2=6 coins minimum to represent 34 cents
	*/
}
