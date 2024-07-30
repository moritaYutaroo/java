import java.util.Arrays;
public class sequences_3 {
    public static void main(String[] args) {
        int [] previous = {1, 2, 3, 4, 5};
        int [] target = new int[(previous.length+1)];
        for (int i = 0; i < previous.length; i++) {
            target[i] = previous[i];
        }
        target[previous.length-1] = 6;
        System.out.println(Arrays.toString(previous)+" "+Arrays.toString(target));
    }
}
