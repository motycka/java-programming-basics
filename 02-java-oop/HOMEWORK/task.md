# Coding Practice

Let's try to pul everything we have learned together.

## CollectionsTask

Let's enhance the **MeteoStation** class we created in task 06.
We will add some sensors to our MeteoStation, and we will create a Sensor class to represent the sensors.
The sensor will have a **type**, **unit**, and **value**. We will use enums to represent the sensor types and units.


### 1. Create a **SensorType** enum
 - It should have thw following values:
   - **TEMPERATURE**
   - **HUMIDITY**
   - **PRECIPITATION**
 - The enum should have a `String` property `typeName` that will hold of the sensor type name values Temperature, Humidity and Precipitation, respectively.

### 2. Create a **UnitType** enum similar to the one from task 08:
 - It should have thw following values:
   - **CELSIUS**
   - **PERCENT**
   - **MILLIMETER**
 - It should also have `String symbol` property just like in the previous task. 

### 3. Create a **Sensor** class (record)
 - It should have the following properties:
   - `SensorType type`
   - `UnitType unit`
   - `double value`
 - Implement the conversion methods for the temperature units, like in task 07:
   - `boolean isCelsius()`
   - `boolean isFahrenheit`
   - `Sensor toCelsius`
   - `Sensor toFahrenheit`
   - `boolean valueEquals(Sensor other)`

### 4. Add validation
Enhance the **Sensor** class so that it can only be instantiated with valid SensorType and UnitType combinations.

 - For example, it should not be possible to create a **Sensor** with **TEMPERATURE** type and **PERCENT** unit.

   <div class="hint">
   Use <code>Error.invalidUnitError();</code> for error handling.
   </div>
   
Add similar validations to the `toCelsius` and `toFahrenheit` methods. 
 - For example, it should throw an error when `toCelsius` or `toFahrenheit` is called on **PRECIPITATION** or **HUMIDITY** sensor.
