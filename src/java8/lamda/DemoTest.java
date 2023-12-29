package java8.lamda;

public class DemoTest {
    public static void main(String[] args) {
        Demo demo = Integer::sum;

        System.out.println(demo.sum(10,11));
    }
}
