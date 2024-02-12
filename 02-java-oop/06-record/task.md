# Record Class

All the classes we created are examples of data classes - classes that are intended to hold data to be passed between programs.      
Since **Java 14**, there is a better way to write such type of classes.

Try using `record` instead of `class`.

There are few differences and limitations to consider when using record:
 * record does not allow multiple constructors
 * all record fields are final

## CollectionsTask

1. Let's enhance our model, and create a **record** class called **Sensor**, which has the following properties:
 - `unit`
   - a **String** representing the unit of the sensor
   - it will have values of either "C" for Celsius or "F" for Fahrenheit
 - `value`
   - a **double** representing current value of the sensor

2. Create an explicit constructor for the **Sensor** record that will contain validation for the unit field. 
   - If the unit is not "C" or "F", it should return an error.

   <div class="hint" style="padding: 5px; border: 1px green solid;">
      We have not learnt how to return errors yet, so for the purpose of this exercise, just call this method at the appropriate place:
      <br />
      <br />
      <code>Error.invalidUnitError();</code>
   </div>

3. Optinally, for the sake of better code maintainability, you can create **public static** constants for the unit values.
   Example: 
   ```java
   public static final String CELSIUS = "C";
   public static final String FAHRENHEIT = "F";
   ```
