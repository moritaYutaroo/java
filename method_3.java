public class method_3 {
    // 同一の関数名だけど、引数の型が異なる場合、オーバーロードという。
    public static int add(int x, int y) {
        return x + y;
    }
    public static double add(double x, double y) {
        return x + y;
    }
    public static String add(String x, String y) {
        return x + y;
    }
    public static void main(String[] args) {
        String join_text = add("hello", "world");
        int int_num = add(10, 20);
        double double_num  = add(11.2215, 20.5);
        System.out.println("join_text:"+join_text);
        System.out.println("int_num:"+int_num);
        System.out.println("double_num:"+double_num);
    }
}
