# Operators

We can define these types of operators in Java:
- Assignment operators
- Arithmetic operators
- Comparison operators
- Logical operators
- Bitwise operators

## Assignment operators
Assignment operators are used to assign value to variable or constant.

- **Variable** is container (memory allocation) for storing data, which can be changed during program execution.

- **Constant** is also container for storing data, but it's value cannot be changed during program execution.

Example:
```java
// Variables
int number = 3;
String text = "Hello";
Date date = new Date();

// Constant
final static int importantNumber = 42;
```

## Arithmetic operators
Arithmetic operators are used to perform mathematical operations.

Example:
```java
double sum = a + b;
double difference = a - b;
double product = a * b;
double quotient = a / b;
double remainder = a % b;
double increment1 = ++a;
double increment2 = a++;
double increment1 = --b;
double increment2 = b--;
```

## Comparison operators
As the name suggest, comparison operators are used for comparing values. 
They always yield a boolean value.

Example:
```java
bool isEqual = a == b;
bool isNotEqual = a != b;
bool isGreater = a > b;
bool isLess = a > b;
bool isGreaterOrEqual = a >= b;
bool isLessOrEqual = a >= b;
```

## Logical operators
Logical operators are used to evaluate logic between variables or values. They always yields boolean value.

Example:
```java
bool isTrue = statement1 && statement2;
bool isEitherTrue = statement1 || statement2;
bool neitherIsTrue = !(statement1 || statement2);
```

## Bitwise operators
Bitwise operators are used to perform bit-level operations on integer (int and long) values.

Binary AND:
```java
int a = 5; // binary: 0101
int b = 3; // binary: 0011

int result = a & b; // binary: 0001, decimal: 1
```

Binary OR:
```java
int a = 5; // binary: 0101
int b = 3; // binary: 0011

int result = a | b; // binary: 0111, decimal: 7
```

Binary XOR:
```java
int a = 5; // binary: 0101
int b = 3; // binary: 0011

int result = a ^ b; // binary: 0110, decimal: 6
```

Binary Complement:
```java
int a = 5; // binary: 0101

int result = ~a; // binary: 1010, decimal: -6
```

Left Shift (signed):
```java
int a = 5; // binary: 0101

int result = a << 1; // binary: 1010, decimal: 10
```

Right Shift (signed):
```java
int a = 5; // binary: 0101

int result = a >> 2; // binary: 0001, decimal: 1
```

Right Shift (unsigned):
```java
int a = -5; // binary equivalent of -5: 11111111111111111111111111111011

int result = a >>> 1; // shifts right with zero fill
```
