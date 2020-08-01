package recursion;

import java.util.Scanner;
/**
 * In this lesson, we will be learning about 'Fallback' Recursion.
 *
 * When a function calls upon itself atleast one time, the funtion becomes recursive.
 *
 * Fallback statements are a sub-category of Recursion statements.
 *
 * Fallback statemnets are used to ensure the user inputs all data correctly.
 *
 * The funtion will run over and over again until the user inputs correctly.*/

public class Fallback {
	public static void main(String[] args) {
		System.out.println("This program will find demonstrate 'fallback' situations, which is one example of recursion.");

    //calls upon the neverEnd method
    neverEnd();

    System.out.println("When creating a game, we want the user to spell correctly and not write nonsense during the input.");
    System.out.println("Recursion statements help as they create a 'fallback' statement that runs until the input is given correctly.");

    //calls upon the realLifeExample
    realLifeExample();

    //end in a nice tone
    System.out.println("Thanks for learning a part of recursion, have a good day.");
	}

  public static void neverEnd() {

		Scanner readInput = new Scanner(System.in);

    System.out.println("This will never end unless the user types 'end'.");

    //reads input from the user
    System.out.println("Type:");
    String input_1 = readInput.nextLine();

    //this function only ends when the user enters 'end'
    if (input_1.equals("end")) {
      System.out.println("Nice job on ending the infinite loop.");
    }
    else {
      //calls the function within the function to make it recursive
      neverEnd();
    }
  }

  public static void realLifeExample() {
		Scanner readInput = new Scanner(System.in);
    System.out.println("");
    System.out.println("Which direction do you want to turn? (left/right)");

    //reads input from reader
    System.out.println("Type:");
    String input_2 = readInput.nextLine();

    //if the input is 'left' or 'right', then only the function ends
    if (input_2.equals("left")) {
      System.out.println("Your character turned left and reached the end.");
    }
    else if (input_2.equals("right")) {
      System.out.println("Your character turned right and reached the end.");
    }
    else {
      //calls the function within the function to make it recursive
      realLifeExample();
    }
  }
}
