## Arrays

Arrays are used to store multiple values of the same type in one variable. You can declare arrays of both primitive and non-primitive types.

Arrays have a fixed size, which must be set during declaration.

```
String[] languages = new String[4]; // will create array of 4 elements
```
You can change value of an array by its index (zero-based). If you try to assign value outside of array bound, you will get an error.

```
String[] languages = new String[4];
languages[0] = "Java";
languages[1] = "Python";
languages[2] = "C++";
languages[3] = "JavaScript";

// this will cause a runtime exception: Index 4 out of bounds for length 4
languages[4] = "Kotlin";
```

You can also declare an initialize array in one step

```
String[] languages = new String[] {"Java", "Python", "C++", "JavaScript"};

// or just
String[] languages = {"Java", "Python", "C++", "JavaScript"};
```
