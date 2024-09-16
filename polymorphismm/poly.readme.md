# Polymorphism
- Polymorphism in Java is one of the core concepts of Object-Oriented Programming (OOP).

- There are two types of polymorphism in Java:

 1. Compile-Time Polymorphism (Method Overloading)
Method Overloading allows multiple methods in the same class to have the same name but different parameters (type, number, or both). The method that gets called is determined at compile time, based on the method signature.
```java
class Calculator {
    // Overloaded method for adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for adding three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method for adding two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));           // Calls add(int, int)
        System.out.println(calc.add(10, 20, 30));       // Calls add(int, int, int)
        System.out.println(calc.add(10.5, 20.5));       // Calls add(double, double)
    }
}
```

 2. Run-Time Polymorphism (Method Overriding)
Method Overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. In this case, the method that gets called is determined at runtime, based on the actual object type.
```java
class Animal {
    // Base method
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();   // Upcasting
        Animal cat = new Cat();   // Upcasting

        animal.sound();  // Output: Animal makes a sound
        dog.sound();     // Output: Dog barks
        cat.sound();     // Output: Cat meows
    }
}
```