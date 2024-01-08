package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        Predicate<List<String>> predicate = list -> {
            for (String str : list) {
                if (Character.isLowerCase(str.charAt(0)) || Character.isDigit(str.charAt(0))) {
                    return false;
                }
            }

            return true;
        };

        return predicate;
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        Consumer<List<Integer>> consumer = list -> {
            List<Integer> arr = new ArrayList<>(list);

            for (Integer x : arr) {
                if (x % 2 == 0) {
                    list.add(x);
                }
            }
        };


        return consumer;
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        Supplier<List<String>> supplier = () -> {
            List<String> list = new ArrayList<>(values);

            for (String str : values) {
                if (Character.isLowerCase(str.charAt(0)) || str.charAt(str.length() - 1) != '.' || str.split(" ").length <= 3) {
                    list.remove(str);
                }
            }

            return list;
        };

        return supplier;
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        Function<List<String>, Map<String, Integer>> function = list -> {
            Map<String, Integer> map = new HashMap<>();

            for (String str : list) {
                map.put(str, str.length());
            }

            return map;
        };

        return function;
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction = (list1, list2) -> {
            List<Integer> result = new ArrayList<>(list1);
            result.addAll(list2);
            return result;
        };

        return biFunction;
    }
}
