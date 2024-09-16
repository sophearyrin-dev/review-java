//With Sealed class: limit the number subclass
public sealed class Person permits Student, Employee {

}

//subclass must be final
final class Student extends Person {

    
}

final class Employee extends Person {

}

//error
//final class Manager extends Person {

//}