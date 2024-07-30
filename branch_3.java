public class branch_3 {
    public static void main(String[] args) {
        boolean tenki = true;
        if (tenki) {
            System.out.println("洗濯をします");
            System.out.println("散歩に行きます");
        } else {
            // {}の中で使用する変数は、{}の外では使用できない
            System.out.println("DVDを見ます");
        }
    }
}
