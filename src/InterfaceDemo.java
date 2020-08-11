import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceDemo {

    @FunctionalInterface
    public interface Calculate{
        int calc(int x, int y);
    }

    public static  void main(String [] args){
        Calculate add = (a,b) -> a + b;
        System.out.println(add.calc(1,2)); //Calls interface method!
        Squad sq1 = new Squad();
        Squad sq2 = new Squad();
        List<Squad> squads = Arrays.asList(sq1,sq2);
        int totalMembers = squads.stream().collect(Collectors.summingInt(Squad::getMembers));
        System.out.println(totalMembers);
    }
}
class Squad {
    int members =5;
    public int getMembers() {
        return members;
    }
}