// public class calculate_7 {
//     public static void main(String[] args){
//         System.out.println("あなたの名前を教えて下さい。");
//         String name = new java.util.Scanner(System.in).nextLine();
//         System.out.println("あなたの年齢を教えて下さい。");
//         int age = new java.util.Scanner(System.in).nextInt();
//         System.out.println("ようこそ、" + age + "歳の" + name + "さん");
//     }
// }
public class calculate_7 {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        try {
            System.out.println("あなたの名前を教えて下さい。");
            String name = scanner.nextLine();
            System.out.println("あなたの年齢を教えて下さい。");
            int age = scanner.nextInt();
            System.out.println("ようこそ、" + age + "歳の" + name + "さん");
        } finally {
            scanner.close();
        }
    }
}