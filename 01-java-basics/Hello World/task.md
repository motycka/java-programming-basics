# "Hello, World"

Welcome to the Java programming exercises.
We will start as we usually do when learning new language: we will write **"Hello, World"** to the console.

In order to do so, we must learn to our first executable application in Java.

## The main method
To create an executable program in Java, we must write a class that will contain a special method,
which serves as the entry point for an application. When your Java program starts, the JVM will recognize this method and call it.
Any code you want to run must be included within the body of this method, either directly or through method calls.

This special methods is called **main** and must have the following signature:
```
public static void main(String[] args);
```

**Here are few important things about the method:**
1. The method name must be **main**
2. The main method must be a member of a **public class**, so that it is visible outside it's package
3. The main method must have a **public** access modifier, so that it is accessible everywhere
4. The main method must be **static**
5. The main method must have **void** return type, this means it does not return any value
6. The main method must accept one argument of `String[] args`, which is used for command line arguments that may be passed to it

Don't worry too much about the various access modifiers, arguments and return types, we will dive deeper into them later in this course.

## Printing to the console

Java comes with many built-in features and functions. One of them is `System.out.print` or `System.out.println`.
The difference between them is that the latter will add newline at the end.

So to print something to console, you would call
```
System.out.println("Something ... ");
```

## Let's try it out

Open [Main.java](Main.java) file and click Run
