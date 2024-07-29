import java.util.HashMap;

public class calculate_practice {
    // public static void main(String[] args){
    //     int x = 5;
    //     int y = 10;
    //     String ans = "x+yは"+(x+y);
    //     System.out.println(ans);
    // }
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        try{
            System.out.println("ようこそ占いの館へ");
            System.out.println("あなたの名前を入力してください");
            String name = scanner.nextLine();
            System.out.println("あなたの年齢を入力してください");
            String ageString = scanner.nextLine();
            int fortune = new java.util.Random().nextInt(2);
            fortune+=1;
            System.out.println("占いの結果が出ました！");
            // #jsonのようにdictから値を取り出す
            HashMap<Integer, String> map = new HashMap<>();

            // キーと値のペアを追加
            map.put(1,"大吉");
            map.put(2,"中吉");
            map.put(3,"吉");

            // キーを使用して値を取得
            String value = map.get(fortune);
            System.out.println(ageString + "歳の" + name + "さん、あなたの運勢は" + value + "です。");
        }finally{
            scanner.close();
        }


    }
}
