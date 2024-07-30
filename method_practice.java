public class method_practice {
    public static void main(String[] args) {
        String title = "お誘い";
        String address = "test@icloud.com";
        String Body = "富士山ガンバ";
        email(title, address, Body);
        email(address, Body);
    }
    // 5-1
    public static void introduceOneself(){
        String name = "Tom";
        int age = 20;
        double height = 170.5;
        char zodiac = '戌';
        System.out.println("名前："+name);
        System.out.println("年齢："+age);
        System.out.println("身長："+height);
        System.out.println("干支："+zodiac);
    }
    // 5-2
    public static void email(String title, String address, String Body){
        System.out.println(address+"にメールを送信しました。\n件名："+title+"\n本文："+Body);
    }
    // 5-3
    public static void email(String address, String Body){
        System.out.println(address+"にメールを送信しました。\n件名：無題\n本文："+Body);
    }
    // 5-4
    public static double calcTriangleArea(double bottom, double height){
        return (bottom * height) / 2;
    }
    // 5-5
    public static double calcCircleArea(double radius){
        return radius * radius * 3.14;
    }
    
}
