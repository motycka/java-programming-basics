# Data Types


Let's look have a look at data types, assignment operators and simple arithmetic operators.

## Practice
Assume we have a meteorological station that collects data from the environment. 
The station is equipped with the following sensors with values of specified range.

For each variable representing the values, find the smallest possible data type to hold the data without any data loss.

 - **stationName** 
   - text
   - any length
 - **id**
   - whole number 
   - 1000000-9999999
 - **firmwareVersion**
   - whole number 
   - range 0-255
 - **longitude**
   - fractional number 
   - -180.0-180.0
   - up to 15 digit precision
 - **latitude**
   - fractional number 
   - -90.0-90.0
   - up to 15 digit precision
 - **downlink**
   - true or false
 - **batteryVoltage**
   - whole number 
   - 0 - 4500
 - **temperature**
   - fractional number
   - up to 4 digit precision
 - **humidity**
   - fractional number 
   - up to 4 digit precision
 - **windSpeed**
   - fractional number 
   - positive
   - up to 4 digit precision
 - **windDirection**
   - whole number 
   - 0-7
 - **precipitationCounter**
   - whole number 
   - up to 65535

Then, print the following text to the console to verify the solution:
```
Station name: Meteo Station XYZ
Firmware version: 204
ID: 12345678
Latitude: 49.123456
Longitude: 16.123456
Downlink: true
Battery voltage: 3500
Temperature: 24.5
Humidity: 64.3
Wind speed: 12.4
Wind direction: 4
Precipitation counter: 34567
```



