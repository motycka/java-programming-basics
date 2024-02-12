# Exceptions

Exceptions are events that disrupt the normal flow of program execution.

They can arise due to various types of errors such as IO errors, arithmetic errors, null pointer access, etc.

- Exception is just another type of Java object:
  - Exception is an instance of a **Exception** class or one of its subclasses.
  - There are several subclasses of Exception provided in Java by default, but we can create our own by extending these superclases.
  - There are two types of exceptions:
    - **Checked**
    - **Unchecked**

- The Exception object usually carries information about the error that occurred.

- Exception handling allows us to control the program flow and prevent the program from terminating abruptly, which leads to a more robust and fault-tolerant software.

---
## Handling Exceptions

Exceptions are handles using `try-catch-finally` blocks:
```
try {
	// code that might throw an exception
} catch (ExceptionType name) {
       // code to handle the exception
} finally {
       // code that will execute irrespective of an exception occurred or not
}
```

---
## Throwing Exceptions

In Java, "throwing an exception" refers to the process of creating an instance of an Exception (or its subclass) and handing it off to the runtime system to handle.

It's a way of signaling that a method cannot complete its normal computation due to some kind of exceptional condition.

There are two keywords associated with throwing exceptions:
 
- The `throw` keyword is used to "emit" an exception from any block of code.

- The `throws` keyword is used to declare exceptions. It doesn't throw an exception but specifies that there may occur an exception in the method.

You can throw **checked** or **unchecked** exceptions.
- You define checked exceptions by extending the `Throwable` class or one of its subclasses (except RuntimeException and its subclasses).
-
- You define unchecked exceptions by extending the `RuntimeException` class or one of its subclasses.
