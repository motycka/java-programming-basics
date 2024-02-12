# Polymorphism 

In programming, polymorphism allows us to define one interface or method that can have multiple implementations. It means that the same method or property could exhibit different behavior in different instances of object implementing given interface.

There are two types of polymorphism:

 - Compile-Time polymorphism
 - Run-Time polymorphism

## Compile-Time Polymorphism
Compile-time polymorphism is achieved through method overloading. The correct method to call is determined by the compiler at compile time based on the method signature.

```
public class Main {

  public static void main(String args[]) {
	Calculate obj = new Calculate();
	System.out.println(obj.add(10, 20));      // prints 30
	System.out.println(obj.add(10, 20, 30));  // prints 60
  }

}
```

```
class Calculate {
  // method with 2 parameters
  int add(int a, int b) {
	return a + b;
  }
 
  // overloaded method with 3 parameters
  int add(int a, int b, int c) {
    return a + b + c;
  }
}
```


## Run-Time Polymorphism
Runtime polymorphism is a process in which a call to an overridden method is resolved at runtime rather than at compile-time. This mechanism allows the Java Virtual Machine (JVM) to decide which method to invoke from the class hierarchy at runtime, based on the type of object.

**Superclass:**
```
class Animal {
  void makeSound() {
	 System.out.println("(silence)");
  }
}
```

**Subclass 1:**
```
class Cat extends Animal {
  void makeSound() {
	System.out.println("meow");
  }
}
```

**Subclass 2:**
```
class Dog extends Animal {
  void makeSound() {
	System.out.println("woof");
  }
} 
```

**Usage:**
```
public class RuntimePolymorphismExample {
  public static void main(String[] args) {
	Animal animal0 = new Animal();
	Animal animal1 = new Cat(); // Animal reference but Dog object
	Animal animal2 = new Dog(); // Animal reference but Cat object
	animal0.makeSound(); // prints "(silence)"
	animal1.makeSound(); // prints "woof"
	animal2.makeSound(); // prints "meow"
  }
}
```

