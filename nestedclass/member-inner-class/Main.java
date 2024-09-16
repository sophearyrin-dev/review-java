class OuterClass {
    private String message = "Hello from Outer Class";

    class InnerClass {
        public void displayMessage() {
            System.out.println(message);  // Accessing outer class's member
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayMessage();  // Output: Hello from Outer Class
    }
}
