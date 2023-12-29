package java8.default_method;

public class Test {
    public static void main(String[] args) {
        Cal cal = new CalImpl();
        System.out.println(cal.sqrt(10));
        System.out.println(cal.calculate(10));
    }
}
