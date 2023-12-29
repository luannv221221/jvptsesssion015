package java8.lamda;

public class Test {
    public static void main(String[] args) {
        Drawable drawable = new Drawable() {
            @Override
            public void draw(String fullName,int age) {
                System.out.println("Xin chào"+fullName);
            }
        };

        drawable.draw("OKOKO",18);
    }
}
