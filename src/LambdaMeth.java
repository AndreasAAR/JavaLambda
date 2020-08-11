
import java.math.BigInteger;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class LambdaMeth {
    public static void main(String[] args){
        IntFunction<String> intToString2 = Integer::toString;
        System.out.println("Expected value 4, actual value: " + intToString2.apply(4567).length());
        Function<String, BigInteger> newBigInt = BigInteger::new;
        System.out.println("Expected 123456789, actual: "  + newBigInt.apply("123456789"));
        Consumer<String> print = System.out::println;
        print.accept("PRINT DIRECTLY");
        UnaryOperator<String> makeGreeting = "Hello, "::concat;
        System.out.println(makeGreeting.apply("Peppa pig"));
        
    }
}
