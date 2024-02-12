# Inheritance

Inheritance establishes an "is-a" relationship between two classes, where one class inherits properties and methods of the other class.

The class that inherits is called subclass and the class inherited from is called superclass.

 - To define inheritance, the **extends** keyword is used.
 - If a superclass has a non-default constructor, you must call **super();** method in the subclass constructior.
 - You can mark methods and attributes of a superclass as **protected**. This will make them only accessible within the same package or within subclass.
 - You can reference fields and methods in the superclass class using the **super** keyword.
 - To prevent inheritance, you can mark the class with **final** modifier.


**Superclass:**
``` 
class Animal {
  private final String sound;

  public Animal(String sound){
  	this.sound = sound;
  }
 
  public void makeSound() {
	System.out.println(sound);
  }
 
  protected void makeRawSound() {
	System.out.println(sound);
  }
}
```


**Subclass of Animal, superclass of Cat and Dog:**
```
class BarkingAnimal extends Animal {

  public BarkingAnimal() {
	// calls superclass constructor
	super("woof");
  }
}
```

**Subclass of Animal:** 
```
class Cat extends Animal {

  public Cat(String sound) {
	// needs to call superclass constructor
	super(sound);
  }
  
}
```

**Subclass of BarkingAnimal:**
```
class Dog extends BarkingAnimal {
  // doesn't need to call superclass constructor
}
```

**Instantiation:**
```
Cat cat = new Cat("meow");
cat.makeSound();
 
Dog dog = new Dog();
dog.makeSound();
 
// this would not compile, because makeRawSound is protected
// dog.makeRawSound();
```


## Final modifier
You can use the final class modifier to prevent class to be inherited from.

```
final class Cat {
	public void makeSound(){
		System.out.println("meow");
	}
}
```
