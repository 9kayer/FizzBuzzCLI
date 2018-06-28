package com.exam.fizzbuzz.printer;

/**
 * Printer interface. Implementation of this interface will be responsible for showing the output to the user.
 * @author fabio
 *
 */
@FunctionalInterface
public interface Printer {

	/**
	 * Shows the output to the user.
	 * @param result
	 */
	public void print(String result);
}
