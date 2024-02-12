# Encapsulation

Encapsulation is a concept of controlling access to the internal state of an object, protecting it from unauthorized access and ensuring data integrity.

- In Java, this is typically achieved using access modifiers (private, protected, public) and getter/setter methods.

- By using getter/setter methods, the class can enforce its own data validation rules to ensure it's internal state remains valid and consistent.

Example:
```
public class Animal {

	// birthDate holds internal state, and is not accessible from outside the class
	private LocalDate birthDate;
 
	// birthDate is only read through a getter
	public LocalDate getBirthDate() {
		return birthDate;
	}
 
	// birthDate is only changed through a setter, which ensures validation
	public void setBirthDate(LocalDate birthDate) {
		if (birthDate.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Birth date cannot be in the future");
		} else {
			this.birthDate = birthDate;
		}
	}
}
```
