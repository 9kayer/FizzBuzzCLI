package com.exam.fizzbuzz.brain;

import com.exam.fizzbuzz.rule.Rule;

public class FunctionalBrain implements Brain {

    private int current;
    private int max;
    private Rule rule;

    public FunctionalBrain(int current, int max, Rule rule) {
        this.current = current - 1;
        this.max = max;
        this.rule = rule;
    }

    @Override
    public String nextValue() {

        if(!hasNext()){
            return null;
        }

        current++;
        return rule.apply(current);
    }

    @Override
    public boolean hasNext() {
        return current + 1 <= max;
    }

}