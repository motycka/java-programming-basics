# Arithmetic Operators, Nested Arrays

In this example, you have a two-dimensional array with temperature data (as double), 
representing days and temperature measurement for each day similar to this:

```java
double[][] temperatures = {
        { 4.7, 11.9, 5.5, 5.1 },    // Monday
        { 8.6, -255.0, 11.6, 7.8 }, // Tuesday
        { 11.2, 5.1, 6.0, 99.0 },   // Wednesday
        { 11.4, 8.1, 12.7, 8.5 },   // Thursday
        // more days ...
};
```

Your task is to write a program, that will calculate a **simple arithmetic mean** of temperature for each day as **float**, 
and print it on the console in this format:
```
Monday: <value as float>
Tuesday: <value as float>
Wednesday: <value as float>
Thursday: <value as float>
... 
```

Assign each day a name based on it's index in the array:
 - 0 = Monday
 - 1 = Tuesday
 - 2 = Wednesday
 - 3 = Thursday
 - 4 = Friday
 - 5 = Saturday
 - 6 = Sunday

Assume, the first element of the array is always data for Monday, but you don't know how many days the array contains. 
It may contain whole week, or not. It may also contain more than one week.

There is also possibility that the array will contain invalid data:
 - Exclude all values that are outside the range from -45.0 to 45.0, inclusive, from the average. 
 - If you do remove a value, make sure to decrement the divisor

**For example:**
 - Data set `{ 8.6, -255.0, 11.6, 7.8 }` has invalid value **-255.0**.
 - You should calculate temperature mean as sum of `(8.6 + 11.6 + 7.8) / 3`


<div class="hint">
  Use switch to decide how decide the day name, or you can use array with day names and go by index in that array.
</div>

<div class="hint">
  If your values don't match, check that you are printing them as **float**.
</div>

