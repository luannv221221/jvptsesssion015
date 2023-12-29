package java8.default_method;

@FunctionalInterface public interface Cal {
    // phương thức trừu tượng
    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
