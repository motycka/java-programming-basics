# Methods

We have already seen several methods in previous exercises. 
For example, the **main** method is a method that is called when a Java program starts.
Class **constructors** are also methods, called when an object is created.
**Setters** and **getters** are actually pretty regular methods, just with a special name and purpose.

Let's take a look at some other examples of methods in Java.

## CollectionsTask

Let's enhance our Sensor record. Implement the following methods in the **Sensor** class:
 - `public boolean isCelsius()`
   - returns true if the unit is Celsius
 - `public boolean isFahrenheit()`
   - returns true if the unit is Fahrenheit
 - `public Sensor toCelsius()`
   - returns a new Sensor object with the value converted to Celsius
   - if the unit is already Celsius, returns the same object
 - `public Sensor toFahrenheit()`
   - returns a new Sensor object with the value converted to Fahrenheit 
   - if the unit is already Fahrenheit, returns the same object
 - `public boolean valueEquals(Sensor temperatureSensor)`
   - returns true if the value of the temperatureSensor are equal to the value and unit of the given temperatureSensor
   - returns true even if the two sensors are in different unit


There might be a quite fundamental flaw in this design. Can you spot it?
