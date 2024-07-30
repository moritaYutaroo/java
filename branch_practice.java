// import java.util.HashMap;

public class branch_practice {
    public static void main(String[] args){
        // // 3-1-1
        // int weight = 60;
        // if (weight == 60){
        //     System.out.println("正解です。");
        // } 
        // else {
        //     System.out.println("不正解です。");
        // }

        // // 3-1-2
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // try {
        // System.out.print("あなたの年齢を教えて下さい。"+"\n");
        // System.out.print("年齢：");
        // int own_age = scanner.nextInt();
        // System.out.print("推しの年齢を教えて下さい。"+"\n");
        // System.out.print("年齢：");
        // int osi_age = scanner.nextInt();
        // int sum = own_age + osi_age;
        // if (sum < 30){
        //     System.out.print("合計は30未満です。");
        // }
        // else {
        //     System.out.print("合計は30以上です。");
        // }
        // } finally {
        //     scanner.close();
        // }

        // // 3-1-3
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // try{
        // System.out.print("あなたの年齢を教えて下さい。"+"\n");
        // System.out.print("年齢：");
        // int own_age = scanner.nextInt();
        // if(own_age % 2 == 0){
        //     System.out.print("あなたの年齢は偶数です。");
        // }
        // else {
        //     System.out.print("あなたの年齢は奇数です。");
        // }
        // } finally {
        //     scanner.close();
        // }

        // // 3-1-4
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // try{
        //     System.out.print("あなたの氏名を教えて下さい。"+"\n");
        //     System.out.print("氏名：");
        //     String name = scanner.nextLine();
        //     if(name.equals("湊")){
        //         System.out.print("湊です。");
        //     }
        //     else {
        //         System.out.print("湊じゃないです。");
        //     }
        // } finally {
        //     scanner.close();
        // }

        // // 3-3
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // try{
        //     int gender = new java.util.Random().nextInt(2);
        //     System.out.print("年齢を教えて下さい。"+"\n"+"年齢：");
        //     int age = scanner.nextInt();
        //     System.out.print("こんにちは"+"\n");
        //     System.out.print(gender);
        //     switch (gender) {
        //         case 0:
        //             System.out.print("私は男です。");
        //             System.out.print("私は"+age+"歳です。");
        //             break;
        //         case 1:
        //             System.out.print("私は女です。");
        //             System.out.print("年齢は秘密です。");
        //             break;
        //     }
        // } finally {
        //     scanner.close();
        // }

        // // 3-5
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // try{
        //     System.out.println("[メニュー]1:検索 2:登録 3:削除 4:変更>");
        //     int select = scanner.nextInt();
        //     switch (select) {
        //         case 1:
        //             System.out.println("検索します。");
        //             break;
        //         case 2:
        //             System.out.println("登録します。");
        //             break;
        //         case 3:
        //             System.out.println("削除します。");
        //             break;
        //         case 4:
        //             System.out.println("変更します。");
        //             break;
        //         default:
        //             System.out.println("選択された番号はありません。");
        //     }
        // } finally {
        //     scanner.close();
        // }
        
        // 3-6
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("【数あてゲーム】");
        int ans = new java.util.Random().nextInt(10);
        try{
            System.out.println("0~9の数字を入力してください。");
            int num = scanner.nextInt();
            for (int i = 0; i < 100; i++){
                if (num == ans){
                    System.out.println("アタリ！");
                    break;
                }
                else {
                    System.out.println("違います。");
                }
            }
        } 
        finally {
                scanner.close();
            }
        System.err.println("ゲームを終了します。");

    }
}
