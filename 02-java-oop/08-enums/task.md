# Enums

Now let's take a look at how we can use enums to help us with the previous task.

## CollectionsTask

1. Create a new enum called `UnitType` with two values: `CELSIUS` and `FAHRENHEIT`.

2. Modify the `Sensor` class to use the `UnitType` enum instead of a String.

3. Add a private property to the `Sensor` class called `symbol` of String type.
   - This property should be initialized in the constructor.
   - Assign proper symbol to each enum value.

4. Since the class now accepts unit as enum type and enums by design allow limited set of values, you can remove the constructor validation.

5. If you used `if-else` statements in for the conversion logic, try to replace them with a `switch` statement. It works really well with enums.
