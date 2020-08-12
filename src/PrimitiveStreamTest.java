import java.util.Arrays;
import java.util.stream.Stream;

public class PrimitiveStreamTest {
    public static void main(String[]args){
        Arrays.stream(new int []{2,4,2,8}).map(n->n+n).average().ifPresent(System.out::println);
        //(2+2+4+8)*2/ 4 = 16/2 = 8
    }
}
