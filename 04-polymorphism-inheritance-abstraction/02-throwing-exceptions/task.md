# Throwing Exceptions

## CollectionsTask

Implement a `ConnectionHandler` class with the following methods:
 - `connect()` - connects to a server - implement by just setting **connected** field to true
 - `ping()` - should throw a `ConnectionException` if connected is false

Implement a `ConnectionException` class that extends `Throwable` and has a constructor that accepts a message.
