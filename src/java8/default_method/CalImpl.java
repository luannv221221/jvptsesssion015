package java8.default_method;

public class CalImpl implements Cal{
    @Override
    public double calculate(int a) {
        return a*a-a;
    }

}
