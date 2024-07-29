public class Print_4 {
    public static void main(String[] args){
        System.out.println("モリタです。");
        System.out.println("変数を入れて計算してみます。");
        int a = 31;
        int b = a+1;
        int c  = a+b;
        System.out.println("a + b = " + a+b );
        System.out.println("a + b = " + (a + b)); // 括弧を追加して計算を優先
        System.out.println("a + b = " + c);
    }
}
