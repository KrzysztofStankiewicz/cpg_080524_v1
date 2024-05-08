package com.for_comprehension.function.l1_function;

import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class L1_HelloFunction {

    /*


    (Integer foo, String bar) -> {
       return bar + foo;
    }

    (Integer foo, String bar) -> bar + foo;
    (foo, bar) -> bar + foo;
    i -> i + 1;
    () -> "Hello";
    a -> {}
    () -> {}

    (var foo, var bar) -> bar + foo;
    (@Nullable var foo, var bar) -> bar + foo;
    (foo, bar) -> bar + foo;
     */
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> i + 1;
        BiFunction<Integer, Integer, Integer> bf1 = (i1, i2) -> i1 + i2;

        Consumer<Integer> f2 = a -> {System.out.println(a);}; // Function<T, Void>
        Supplier<Integer> f3 = () -> 42;                      // Function<Void, T>
        Predicate<Integer> f4 = i -> i > 0;
        UnaryOperator<Integer> f5 = i -> i + 1;               // Function<T, T>
        Runnable f6 = () -> System.out.println("Hello");      // Function<Void, Void>
        Callable<Integer> f7 = () -> 42;

        BinaryOperator<Integer> f8 = (i1, i2) -> i1 + i2;     // BiFunction<T, T, T>
    }
}
