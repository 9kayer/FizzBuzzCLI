package com.exam.fizzbuzz;

import com.exam.fizzbuzz.brain.*;
import com.exam.fizzbuzz.translator.Translator;
import com.exam.fizzbuzz.printer.*;
import com.exam.fizzbuzz.rule.Rule;

import java.util.Arrays;
import java.util.List;

/**
 * Application entry point
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	if(args.length < 3) {
    		System.out.println("Please add a positive number as an argument.");
    		return;
    	}
    	
    	int min = Integer.parseInt(args[0]);
    	int max = Integer.parseInt(args[1]);
    	
        Game game = setup(min, max, Arrays.asList(args).subList(2, args.length));
    	game.start();    	
    }
    
    private static Game setup(int min, int max , List<String> ruleStringList) {

		Rule rule = Translator.translateToRule(ruleStringList);

    	Brain brain = new FunctionalBrain(min, max, rule);
		Printer printer = new SimplePrinter();

    	return new Game(brain, printer);
    }
}