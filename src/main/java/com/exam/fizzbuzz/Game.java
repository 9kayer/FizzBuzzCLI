package com.exam.fizzbuzz;

import com.exam.fizzbuzz.brain.Brain;
import com.exam.fizzbuzz.printer.Printer;

/**
 * Game class
 * @author fabio
 *
 */
public class Game {
	private Brain brain;
	private Printer printer;

	public Game(Brain brain) {
		this.brain = brain;
		this.printer = System.out::print;
	}

	/**
	 * Constructor
	 * @param brain
	 * @param printer
	 */
	public Game(Brain brain, Printer printer) {
		this.brain = brain;
		this.printer = printer;
	}

	/**
	 * Starts the game. Exits when the range has been achieved.
	 */
	public void start() {

		while (hasValueToPrint()) {
			print(nextValue());
		}
	}

	private String nextValue() {
		return brain.nextValue();
	}

	private void print(String result) {
		printer.print(result);
	}

	private boolean hasValueToPrint() {
		return brain.hasNext();
	}
}
