# Unit Testing in Java

The purpose of unit testing is to verify individual units of the code base work as intended by the author. It is an essential tool in maintaining internal quality of a software.

### Unit 
Unit is the smallest testable parts of the software, such as individual method, function or objects.

### Assertion 
Assertion is a term used form mechanism of verifying if test expected outcomes match actual outcomes.

Based on result of this evaluation, the assertion ends in one of two states: **Passed** or **Failed**.

## JUnit

To write tests in Java, we can use JUnit, a popular testing framework for Java.

A JUnit test is a regular class, where methods annotated with `@Test` are considered as test methods.
These methods should contain test code and assertions.

To make JUnit test results more readable, we can also use `@DisplayName annotation.

Example:
```
// By convention the name of the test class should be the name of the class under test + "Test"
public class UniversityCourseTest {
 
	// create new LocalDate object with current date which can be reused in tests
	private final LocalDate dateNow = LocalDate.now();
 
	@Test // annotation to mark the method as a test
	public void testGetDaysToStartNotStarted() {
		int expected = 10; // expected result
 
		// create new course with start date in the future
		UniversityCourse course = new UniversityCourse("Java", dateNow.plusDays(expected), 10);
 
		// assert that the result of getDaysToStart() is equal to expected
		Assertions.assertEquals(expected, course.getDaysToStart());
	}
 
	@Test
	public void testGetDaysToStartAlreadyStarted() {
		// create new course with start date in the past
		UniversityCourse course = new UniversityCourse("Java", dateNow.minusDays(10), 10);
 
		//assert that the result of getDaysToStart() is equal to 0
		Assertions.assertEquals(0, course.getDaysToStart());
	}
}
```
