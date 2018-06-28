package com.exam.fizzbuzz.printer;

/**
 * Implementation of Printer. Responsible to show the values to the user, using Standard Output.
 * @author fabio
 *
 */
public class SimplePrinter implements Printer{
	
	/**
	 * Prints to the console the value result
	 * @param String result
	 */
	public void print(String result) {
		System.out.print(result + " ");
	}
}
