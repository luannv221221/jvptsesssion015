package java8.optional;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Student student = null;

    }

    public static Student findStudentById(int Id){
        Optional<Student> student = Optional.of(new Student());
        return student.orElse(null);
    }

}
