/*
 * EclipseCon Europe Che Challenge
 *
 * This program prints the numbers from 1 to 100, with every multiple of 3
 * replaced by "Fizz", and every multiple of 5 replaced by "Buzz". Numbers
 * divisible by both are replaced by "FizzBuzz". Otherwise, the program
 * prints the number.
 *
 * Your mission, if you choose to accept it, is to change this program so that,
 * in addition to the above, it prints "Fizz" for any number which includes a 3,
 * and prints "Buzz" for any number including a 5. After modification, for
 * example, the number 53 should be replaced by "FizzBuzz".
 */

package org.eclipse.che.examples;

public class FizzBuzz {
	public static void main(String[] args){
		for(int i= 1; i <= 100; i++){
			String output = "";
			if(i % 3 == 0) output += "Fizz";
			if(i % 5 == 0) output += "Buzz";
			if(output.equals("")) output += i;
			System.out.println(output);
		}
	}
}
