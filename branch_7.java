public class branch_7 {
    public static void main(String[] args) {
        System.out.print("九九の表を作成します。"+ "\n");
        System.out.print("1の段:");
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print((i*j));
                System.out.print(" ");
                if ((j == 9) && (i <99)){
                    System.out.print("\n");
                    System.out.print((i+1)+"の段:");
                }
            }
        }
    }
}
