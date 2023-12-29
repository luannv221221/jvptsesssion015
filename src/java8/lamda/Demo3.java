package java8.lamda;

public class Demo3 {
    public static void main(String[] args) {
        IDemo3  iDemo3 = System.out::println;

        iDemo3.hello("Nguyễn Văn A");
    }
}
