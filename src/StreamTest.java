import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[]args){
        Stream.of("banana", "Apple").filter(fruit -> {
            return fruit.startsWith("A");
        }).forEach(fruit -> System.out.println(fruit));

    }
}
