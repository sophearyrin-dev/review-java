# 1. Non-static inner class or member inner class
- An inner class in Java is a class that is declared within another class
```java
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
```

# 2. A static nested class 
- is declared inside another class using the static keyword. It cannot access non-static members of the outer class directly.
```java
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
```

# 3. Local Inner Class
- This is a class defined inside a method of the outer class. It can access the method's local variables, but they must be declared as final or effectively final.
```java
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

```

# 4. An anonymous inner class 
is a class without a name that is defined and instantiated in a single statement, often used to implement interfaces or extend classes on the fly.
```java
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

```


