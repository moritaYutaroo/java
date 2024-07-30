import java.util.Arrays;

public class method_2 {
    public static void main(String[] args) {
        int x_value = 10;
        int y_value = 20;
        int result = add(x_value, y_value);
        System.out.println("xとyの合計は："+result);
        String[] array_sample = {"apple", "banana", "cherry"};
        printarray(array_sample);
        String [] copiedArray = Arrays.copyOf(array_sample, array_sample.length);
        System.out.println(Arrays.toString(copiedArray));
    }
    public static int add(int x, int y) {
        return x + y;
    }
    // 配列を渡すと、引数としてアドレスを渡すから参照渡しとなるから注意。
    public static void printarray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }
}
