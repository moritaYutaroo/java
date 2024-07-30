import java.util.stream.Stream;
import java.util.stream.Collectors;

public class branch_6 {
    public static void main(String[] args) {
        for (int i =0;i <10;i+=2){
            System.out.println(Stream.generate(() -> "こんにちは").limit(i).limit(i).collect(Collectors.joining()));
            // System.out.println(StringUtils.repeat("こんにちは", i));
        }
    }
}

