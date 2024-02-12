# Program Control Flow

Java syntax supports a variety of control flow statements. 
These statements break up the flow of execution by employing decision-making, looping, and branching, enabling the program to execute code based on conditions and to repeat code blocks.

## if, else, if-else
```
if (a < b) {
    // execute if first condition is met

} else if (a == b) {
    // execute if second condition is met

} else if (a == null) {
    // execute if third condition is met

} else {
    // execute if no contidion is NOT met

}
```

## Ternary Operator
Java supports tenary operator as a shorthand for if else, which can come in handy when conditionally assigning values.
It can be used to assign a value to a variable based on a condition.

```
String clothes = temperature > 20 ? "T-Shirt" : "Sweater";
```

## switch
The switch operator is generally used in place of multiple **if ... else if ... else** statements. It provides better code readability.

```
String value = switch (direction) {
    case 1 -> "North";
    case 2 -> "East";
    case 3 -> "South";
    case 4 -> "West";
    default -> "Invalid direction";
};
```

## while
The while evaluates condition at the beginning of the loop block, before any code is executed.
```
while (condition) {
  // code block to be executed
}
```

## do-while
The do while first executes code block once, and evaluates condition the condition.
```
do {
  // code block to be executed
} while (condition);
```

## for
For loop executes a block for a given number of iterations. The evaluation of for loop is devided into 3 statements:
- **init** statement is executed once before the execution of the code block
- **condition** statement defines the condition for executing the code block
- **after** statement is executed every time after the code block has been executed

```
for (init; condition; after) {
  // code to be executed
}
```


Example:
```
for (int i = 0; i < 10; i++) {
  // code to be executed
}
```

## for-each
For-each loop is a more concise way to iterate through an array or a collection.
```
String[] languages = {"Java", "Python", "C++", "JavaScript"};
 
for (String language : languages) {
 
    System.out.println(language);
 
}
```

## break / continue
The break statement is used to end the loop immediately.
```
for (int i = 0; i < x; i++) {
 
    if (breakConditon) {
	    break;
    }
 
}
// if breakConditon was met, the loop will end
```

The continue statement is end current iteration, but the loop will continue with next iteration.
```
for (int i = 0; i < x; i++) {
 
    if (continueCondition) {
		continue;
	}
 
	// if continueCondition was met, this code will not be executed
}
````
