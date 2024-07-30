import java.util.Arrays;
public class sequences_4 {
    public static void main(String[] args) {
        int [] previous = {1, 2, 3, 4, 5};
        previous = null;
        previous[1]= 4;
        System.out.println(Arrays.toString(previous));
        // nullと指定した変数に値を代入するとエラーが発生する。
    }
}
