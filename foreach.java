import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");

        // Before Java 8: Using an anonymous class
        names.forEach(new java.util.function.Consumer<String>() {
            public void accept(String name) {
                System.out.println(name);
            }
        });

        // Java 8: Using a lambda expression
        names.forEach(name -> System.out.println(name));
    }
}

