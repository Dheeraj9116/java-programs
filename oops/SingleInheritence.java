package oops;

class Vehicle {

	  public void move() {

	    System.out.println("Vehicle is moving");

	  }

	}

	class Car extends Vehicle {

	  public void openTrunk() {

	    System.out.println("Car trunk opened");

	  }

	}

	public class SingleInheritence {

	  public static void main(String[] args) {

	    Car car = new Car();

	    car.move(); // Inherited from Vehicle

	    car.openTrunk(); // Specific to Car

	  }

	}