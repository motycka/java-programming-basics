# Bitwise Operations
Here is a one for working with binary data.

Imagine you have a meteo station that measures wind speed and wind direction
and for the sake of energy efficiency sends data in binary format.

It sends information about wind speed and wind direction as short (2 bytes), 
and the data is stored as follows:
 - first 8 bits (MSB) represent wind direction
 - last 8 bits (LSB) represent wind speed
 - the values are always positive numbers

## Example:
```
short sensorValue = 1032;
```
In this example, the binary value of short **1032** is `0000010000001000`, seperated by bytes:
 - `00000100` = wind direction is 5
 - `00001000` = wind speed is 8

Your task is to write a program, that will take value of **windSensor** as defined in **WindDataTask.java**,
and resolve value of wind speed and direction into respective windSpeed and windDirection variables.

**There will likely be more ways to accomplish this, 
I would like to you use arithmetic and bitwise operators to accomplish the goal**.

Use hints below if you get stuck.

<div class="hint">
<b>Printing values</b>

If you need to see binary values, try using <b>Integer.toBinaryString</b> function:
<pre>
<code>
System.out.println(Integer.toBinaryString(value));
</code>
</pre>
</div>

<div class="hint">
<b>Getting the wind direction value</b>

You need to somehow isolate values of each of the two bytes.
In case of wind direction, you could probably use bit shift to shift the wind speed values out.

<pre>
<code>
0000010000001000 >> 000000000100 = 5
</code>
</pre>
</div>

<div class="hint">
<b>Getting the wind speed value</b>

It helps to think of the data in its binary form.

We can use a binary mask combined with binary AND operator to isolate just the last 8 bits. 
The binary mask is corresponding to the maximum value of wind speed byte, which **255** 
(or **0x00FF** in hexadecimal format, which may be easier to visualize).

<pre>
<code>
00000100 00001000 = 1032
00000000 11111111 = 255 (0x00FF)
------------------------
00000000 00001000 = 8
</code>
</pre>
</div>


