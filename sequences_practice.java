public class sequences_practice {
    public static void main(String[] args) {
    // 4-1
    // int [] points = new int [5];
    // double [] weights = new double [5];
    // boolean []
    // answers = new boolean [5];
    // String [] names = new String [5];

    // // 4-2
    // int [] moneylist = {121902,8302,55100};
    // for (int i: moneylist) {
    //     System.out.println(i);
    // }
    // for (int i =0; i < moneylist.length; i++){
    //     System.out.println(moneylist[i]);
    // }

    // 4-4
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int [] numbers = {3, 4, 9, 1, 5, 6};
    try {
        System.out.print("1桁の数字を入力してください。");
        int unpit_number = scanner.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == unpit_number) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("ハズレ！ もう一度占います。");
            }
        }
    } finally {
        scanner.close();
    }
}
}


