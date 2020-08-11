import java.util.function.*;

public class InterfaceTest {

    //Predicate, takes one argument, returns boolean.
    //Consumer, takes one argument, and consumes it, no result return.
    //Function, takes one argument, gives result.
    //Supplier, supplies a value of a given type, does not take argument.
    //Unary operator, takes one argument, gives one value.
    //Binary, same as unary, but takes two arguments.

    public static void main(String[] args){
       Predicate<String> stringLen = (s) -> s.length() < 10;
        System.out.println(stringLen.test(("test"))); //returns true
        Consumer<String> consumerStr = (s) -> System.out.println(s.replaceAll(" ","."));
        consumerStr.accept("E P I C"); //Adds . in space
        Function<Integer,String> converter = (num) -> Integer.toString(num);
        System.out.println(converter.apply(11));
        Supplier<String> s = ()-> "Welcome brigador";
        System.out.println(s.get());
        BinaryOperator<Integer> exponent = (a,b)-> a+b; //Cant be done recursively as exponent needs to be init!
        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("Scream this"));


    }


}
