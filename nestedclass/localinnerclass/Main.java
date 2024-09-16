package nestedclass.localinnerclass;

class OuterClass {
    public void methodWithInnerClass() {
        final String localMessage = "Hello from Local Inner Class";

        class LocalInnerClass {
            public void displayMessage() {
                System.out.println(localMessage);  // Accessing local variable
            }
        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.displayMessage();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.methodWithInnerClass();  // Output: Hello from Local Inner Class
    }
}

