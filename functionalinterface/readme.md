Functional interfaces in Java are essential for enabling functional programming, introduced in Java 8.​ They are characterized by containing exactly one abstract method, although they can also have multiple default and static methods. This structure allows for the use of lambda expressions, making code cleaner and more efficient.

1. Definition of Functional Interface
A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. Functional interfaces are commonly referred to as Single Abstract Method (SAM) interfaces, allowing for a streamlined approach to functional programming.

2. Characteristics of Functional Interfaces
Functional interfaces can contain any number of static and default (non-abstract) methods. This versatility allows developers to define reusable operations while maintaining a single point of functional implementation. The abstract method does not require the explicit use of the abstract keyword, as methods defined in interfaces are abstract by default.
3. Lambda Expressions and Functional Interfaces
With the introduction of Java 8, lambda expressions are used to implement functional interfaces, which simplifies the coding process significantly. Lambda expressions can take parameters and return values just like methods, leading to cleaner and more readable code. This change allows developers to implement the abstract method of a functional interface directly in their classes without the overhead of anonymous inner classes.
4. Annotation and Compliance
The @FunctionalInterface annotation is used to ensure that a functional interface complies with the requirement of having a single abstract method. While this annotation is not mandatory, it helps the compiler enforce the constraint, raising an error if more than one abstract method is declared. This prevents accidental violations of the functional interface contract.

5. Built-in Functional Interfaces
Java provides several built-in functional interfaces, facilitating common programming tasks. Examples include Runnable, which has the run() method; Comparable, which includes the compareTo() method; and Callable, which contains the call() method. Functional interfaces also extend to more complex structures like Function, Consumer, Predicate, and their bi- variants, allowing for a wide range of functional programming capabilities.

6. Practical Applications
Functional interfaces enable the implementation of various common tasks in a concise manner. For instance, the Predicate functional interface is typically used for filtering collections by providing a condition and returning a boolean value