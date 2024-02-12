# Inheritance

Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
It is an important part of OOP (Object-Oriented programming).

## CollectionsTask 1

1. Create an **abstract** class **Rectangle** class with the following: 
 - Properties:
   - `double width`, make it **protected**
   - `double height`, make it **protected**
   - **constructor** that initializes both fields
 - Methods:
   - method `area()` that returns the area of the shape, make it **public**
   - method `perimeter()` that returns the perimeter of the shape, make it **public**
   
2. Create a class **Square** that extends **Rectangle**

   Now, if you instantiate either **Square** or **Rectangle** and call the `area()` and `perimeter()` methods, you should get the correct results.


3. Create another class called Cuboid with the following:
 - Properties:
   - `double width`
   - `double height`
   - `double length`
   - **constructor** that initializes all fields
 - Methods:
   - method `volume()` that returns the volume of the block
   - method `surfaceArea()` that returns the surface area of the block

4. Update the **Rectangle** class, add method `toCuboid(double length)` that returns a new `Cuboid` object with the same width, height, and length.

5. Update the **Square** class, add method `toCube()` that returns a new `Cuboid` object with the same width, height, and length. You can proxy the call to the `toCuboid` method of the `Rectangle` class. 

   On this examle you can see that **Square** inherits all **Rectangle** methods and properties, and you can also add new methods to it.
