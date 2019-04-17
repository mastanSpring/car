package car;

class MockStartedEngine extends Engine {
   public int start(int mode) {
   return 0;
   }
}

class MockRestartAgain extends Engine {
   public int start(int mode) {
   return 1;
   }
}

class MockStartedButMaintanceProblem extends Engine {
   public int start(int mode) {
   return 2;
   }
}

class MockSendToGarage extends Engine {
   public int start(int mode) {
   return 3;
   }
}

class Car {
   Engine engine;
   
   public Car(Engine engine){
	this.engine = engine;
   }
   
   public void drive() {
	
	int outcome;
	outcome = engine.start(1);
	
	if(outcome == 0) {
		System.out.println("Started for driving");
	}
	else if(outcome == 1) {
		System.out.println("Restrat again");
	}
	else if(outcome == 2) {
		System.out.println("Started but required maintance");
	}
	else if(outcome == 3) {
		System.out.println("Send to the garage");
	}
   }
}
public class TestCar {
   public static void main(String... ar) {
	
	Car car1 = new Car(new MockStartedEngine());
	car1.drive();
	
	Car car2 = new Car(new MockRestartAgain());
	car2.drive();

	Car car3 = new Car(new MockStartedButMaintanceProblem());
	car3.drive();

	Car car4 = new Car(new MockSendToGarage());
	car4.drive();
	
   }
}

