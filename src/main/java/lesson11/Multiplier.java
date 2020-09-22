package lesson11;

import java.util.function.BiFunction;

@FunctionalInterface
public interface Multiplier extends BiFunction<String,Double,Number> {

     Double apply(String s,Double b);

    }

