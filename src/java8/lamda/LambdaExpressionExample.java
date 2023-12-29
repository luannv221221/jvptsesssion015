package java8.lamda;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        String fullName = "Nguyễn Văn A";
        Drawable drawable = (name,age) -> {
            int ns = 2023 - age;
            System.out.println("Xin chào"+name);
            System.out.println("Bạn sinh nam "+ns);
        };


        drawable.draw(fullName,18);
    }
}
