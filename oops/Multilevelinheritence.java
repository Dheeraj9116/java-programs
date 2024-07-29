package oops;

class Animal {

	  public void eat() {

	    System.out.println("Animal is eating");

	  }

	}

	class Mammal extends Animal {

	  public void giveBirth() {

	    System.out.println("Mammal giving birth");

	  }

	}

	class Dog extends Mammal {

	  public void bark() {

	    System.out.println("Dog is barking");

	  }

	}

	public class Multilevelinheritence {

	  public static void main(String[] args) {

	    Dog dog = new Dog();

	    dog.eat(); // Inherited from Animal

	    dog.giveBirth(); // Inherited from Mammal

	    dog.bark(); // Specific to Dog

	  }

	}