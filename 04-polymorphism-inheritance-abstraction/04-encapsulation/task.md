# Encapsulation

1. Create **Course** class which has two final private fields:
 - String subject
 - LocalDate startDate

3. Create getters for both

3. Create constructor which accepts both, and beside setting their values, also evaluates that:
   - **subject** is not null or empty (blank)
   - **startDate** is not null or before today
   - in case any of these validations fail, throw IllegalArgumentException
4. 
5. Also add a setter for localDate that does the same validation as constructor

