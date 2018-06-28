package com.exam.fizzbuzz.rule;

@FunctionalInterface
public interface Rule {

    String apply(int num);

    default Rule merge(Rule rule){
        return num -> apply(num) + rule.apply(num);
    }

    default Rule ifNotThen(Rule rule){
        return num -> apply(num).isEmpty() ? rule.apply(num) : apply(num);
    }
}
