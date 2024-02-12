# Handling Exceptions

Exceptions are events that disrupt the normal flow of program execution.

They can arise due to various types of errors such as IO errors, arithmetic errors, null pointer access, etc.

 - Exception is just another type of Java object:
   - Exception is an instance of a **Exception** class or one of its subclasses.
   - There are several subclasses of Exception provided in Java by default, but we can create our own by extending these superclases.
   - There are two types of exceptions: 
     - **Checked**
     - **Unchecked**

 - The Exception object usually carries information about the error that occurred.

 - Exception handling allows us to control the program flow and prevent the program from terminating abruptly, which leads to a more robust and fault-tolerant software.

Exceptions are handles using `try-catch-finally` blocks:
```java
try {
	// code that might throw an exception
} catch (ExceptionType name) {
       // code to handle the exception
} finally {
       // code that will execute irrespective of an exception occurred or not
}
```

---

## Practice

### MessageQueue
I have created a MessageQueue class that simulates a message queue. It has the following methods:
 - `connect()`
   - Connects to the message queue. 
   - If the message queue is not available, it throws a `MessageQueueConnectionException`, which is a checked exception.

 - `disconnect()` - 
   - Disconnects from the message queue.

 - `pollMessage()` - 
   - Polls message queue for a message.
   - If the queue is not available, it throws a `MessageQueueConnectionException`, which is a checked exception.
   - If the message poll fails, it throws a `MessageQueueRuntimeException`, which is an unchecked exception.

### MessageQueuePollingService
Your task is to write a program (service) in class `MessageQueuePollingService` that uses the `MessageQueue`
and handles any exceptions that may occur. The program should do the following:
 1. Connect to the message queue using `connect()`.
 2. Poll message in the message queue using `pollMessage()` .
 3. Disconnect from the queue using `disconnect()`
