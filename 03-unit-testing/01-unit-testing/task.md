# Unit Testing

There is an **AuthorizationHandler** class that needs to be tested.
Its purpose is to handle user authorization based on their username and password.

It has the following methods:
 - `void authorize(String username, String password)`
 - `void unAuthorize(String username)`
 - `Status getStatus()`

Where **Status** in an enum and has the following values:
 - **AUTHORIZED**
 - **UNAUTHORIZED**
 - **LOCKED**

The **AuthorizationHandler** should work as follows:
 - User has 3 attempts to **authorize**
 - When a user calls **authorize** successfully, the status should be **AUTHORIZED**
 - When a user calls **authorize** unsuccessfully:
   - internal attempt counter should be incremented
   - the status should be **UNAUTHORIZED**
 - If the authorizes on 1st, 2nd or attempt:
   - the status should be set **AUTHORIZED**
   - the attempt counter should be reset to 0
 - If the user fails to authorize on 3rd attempt, the status should be set **LOCKED**
 - If the user is **AUTHORIZED** and calls the **unAuthorize** method:
   - the status should be set to **UNAUTHORIZED**
   - the attempt counter should be 0
 - If the user is **UNAUTHORIZED** or **LOCKED** and calls the **unAuthorize** method:
   - the status should not change
   - the attempt counter should not change


There is a bug in the code. Can you find it with tests?
