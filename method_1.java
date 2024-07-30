public class method_1 {
    public static void main(String[] args) {
            hello("モリタ");
            hello("斎藤");
            cal_max(122, 22);
    }

    public static void hello(String name) {
        System.out.println(name + "さん。こんにちは");
    }
    public static void cal_max(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
