package com.exam.fizzbuzz.rule;

public enum BaseRules {
    IDENTITY("Identity",Integer::toString),
    FIZZ("fizz", num -> num % 3 == 0 ? "fizz" : ""),
    BUZZ("buzz", num -> num % 5 == 0 ? "buzz" : ""),
    LUCKY("lucky", num -> Integer.toString(num).contains("3") ? "lucky" : ""),
    EMPTY("empty", num -> "");

    private Rule rule;
    private String name;

    BaseRules(String name, Rule rule) {
        this.rule = rule;
        this.name = name;
    }

    public Rule rule() {
        return rule;
    }

    public static BaseRules getBaseRuleByName(String name){
        switch (name){
            case "fizz":
                return FIZZ;
            case "buzz":
                return BUZZ;
            case "lucky":
                return LUCKY;
            case "identity":
                return IDENTITY;
            default:
                return EMPTY;
        }
    }
}
