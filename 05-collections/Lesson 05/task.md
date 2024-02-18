# Wrapper Clases

The purpose of Java wrapper classes is to convert Java primitive types to reference types (objects).

All wrapper classes support auto-boxing and auto-unboxing: automatic conversion of primitive types to the object of their corresponding wrapper classes and vice versa.

Wrapper classes were introduced in Java for several reasons:
Object-Oriented Programming - primitives are not objects in Java
Null handling - wrapper classes can hold null value, unlike primitive types
Data structures - Java Collection Framework can only hold objects, not primitive types
Convenience - wrapper classes come with a number of useful methods for parsing, converting, comparing values, etc.
Immutability - objects these wrapper classes are immutable (meaning their state can’t be changed once created).
This is a useful property, especially when dealing with multi-threaded environments as it eliminates synchronization for object's state manipulation.

These are the wrapper class alternatives for the primitive types:

 - **byte** = Byte
 - **short** = Short
 - **int** = Integer
 - **long** = Long
 - **float** = Float
 - **double** = Double
 - **boolean** = Boolean
 - **char** = Character


Wrapper classes in Java have a number of useful methods that can be used for various operations such as parsing, comparing values, converting to different types, and more.

Example:
```
public class WrapperClassesMemberFunctionsExample {
 
  public static void main(String[] args) {
    Integer i = 10;
	int x = Integer.parseInt("10");
	String str = Integer.toString(10);
	int max = Integer.max(5, 10);
	int min = Integer.min(5, 10);
	int compare = Integer.compare(5, 10);
  }

}
```
