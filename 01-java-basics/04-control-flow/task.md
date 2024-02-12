# Program Control Flow

You have a list of numbers representing temperature (in Celsius) n days. 

## CollectionsTask 

The list a static field `temperatures` already defined in the [Main.java](src/Main.java) class.

Your task is to write a program that will loop through the **temperature** values and print a message to the console in the following format `<weekday name>: it's a <comfort> day!`, so for example
```
Monday: it's a nice day!
Tuesday: it's a cold, dry day!
Wednesday: it's a hot day!
...
```

Use can use predefined static constants for the comfort levels.

Assume that days in the **temperatures** list are starting from Monday, so temperatures[0] is Monday, temperatures[1] is Tuesday, and so on.
You don't know beforehand how many days are in the list.

<div class="hint">
Remember % operator? It can be useful here.
</div>

<div class="hint">
You can use a switch statement to determine the weekday name.
</div>

The comfort levels are defined as follows:
 - **freezing cold** - temperature is below 0°C
 - **cold** - temperature up to 10°C (inclusive)
 - **nice** - temperature up to 20°C (inclusive)
 - **warm** - temperature up to 25°C (inclusive)
 - **hot** - temperature above 25°C
