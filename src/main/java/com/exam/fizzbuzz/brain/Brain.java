package com.exam.fizzbuzz.brain;


/**
 * Brain interface. Responsible for evaluate the value to print.
 * @author fabio
 *
 */
public interface Brain {

	/**
	 * Return the next value to print.
	 * @return Value to print.
	 */
	public String nextValue();	
	
	/**
	 * Checks if there's a next value to print.
	 * @return True if there is, False if not.
	 */
	public boolean hasNext();
}
