# Lambda
-  a lambda expression is a feature introduced in Java 8 that provides a way to express instances of single-method interfaces (functional interfaces) more concisely. It's essentially a way to simplify anonymous inner classes and make the code more readable, particularly in situations involving functional-style operations like sorting or filtering.

# Syntax
- A lambda expression has three parts:
    - Parameters: Optional list of parameters enclosed in parentheses.
    - Arrow token: The -> symbol separates the parameters from the body of the lambda.
    - Body: The actual code to be executed, which can be either a single expression or a block of code.

- Example:
```java
Comparator<Integer> comparator = new Comparator<Integer>() {
    @Override
    public int compare(Integer a, Integer b) {
        return a.compareTo(b);
    }
};
```

To

```java
Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
```

# Common Use
- Using with Streams API: Lambdas are frequently used in combination with the Streams API to perform complex operations on collections.
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.stream()
     .filter(name -> name.startsWith("A"))
     .forEach(name -> System.out.println(name));

```
- Sorting: Lambdas simplify the syntax for sorting collections.
```java
List<String> names = Arrays.asList("Tom", "John", "Emily");
Collections.sort(names, (a, b) -> a.compareTo(b));

```