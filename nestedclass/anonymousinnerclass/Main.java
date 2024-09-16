package nestedclass.anonymousinnerclass;

interface Greeting {
    void greet();
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };
        greeting.greet();  // Output: Hello from Anonymous Inner Class
    }
}

