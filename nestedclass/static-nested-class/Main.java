class OuterClass {
    private static String message = "Hello from Static Nested Class";

    static class StaticNestedClass {
        public void displayMessage() {
            System.out.println(message);  // Accessing static outer class's member
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.displayMessage();  // Output: Hello from Static Nested Class
    }
}
