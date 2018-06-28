package com.exam.fizzbuzz.translator;

import com.exam.fizzbuzz.rule.BaseRules;
import com.exam.fizzbuzz.rule.Rule;

import java.util.LinkedList;
import java.util.List;

public class Translator {

    public static Rule translateToRule(List<String> stringArray){

        List<List<String>> splitedStringList = splitList(stringArray);
        return splitedStringList.stream()
                                .map(stringList ->{
                                    return stringList.stream()
                                                        .map(string -> BaseRules.getBaseRuleByName(string).rule())
                                                        .reduce(BaseRules.EMPTY.rule(),(a,n) -> a.merge(n));

                                })
                                .reduce(BaseRules.EMPTY.rule(), (a,n) -> a.ifNotThen(n))
                                .ifNotThen(BaseRules.IDENTITY.rule());

    }

    private static List<List<String>> splitList(List<String> strings) {
        List<List<String>> result = new LinkedList<>();

        int index = strings.indexOf("or");

        if(index != -1){
            result.add(strings.subList(0,index));
            result.addAll(splitList(strings.subList(index + 1, strings.size())));
            return result;
        }

        result.add(strings);
        return result;
    }
}
