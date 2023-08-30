package assignments_core_java;

class Engine {
	int id = 125;
	final String engine_type = "Combustion Engine";

	final void showEngineType() {
		System.out.println(engine_type);
	}

	void calSpeed() {
		System.out.println(id * 10);
	}

	void calSpeed(Boolean off_road) {
		if (off_road == true) {
			System.out.println(id * 7);
		}

	}
}

final class Car extends Engine {
	@Override
	void calSpeed() {
		// TODO Auto-generated method stub
		System.out.println(id * 8);
	}
}

class Bike extends Engine {
	@Override
	void calSpeed() {
		// TODO Auto-generated method stub
		System.out.println(id * 12);
	}

}

public class Chapter5 {
	public static void main(String[] args) {
		Engine engine=new Engine();
		engine.id=225;
		engine.showEngineType();
		engine.calSpeed();
		engine.calSpeed(true);
		engine=new Car();
		engine.calSpeed();
		engine.calSpeed(true);
		engine=new Bike();
		engine.calSpeed();
		engine.calSpeed(true);//super() is being called at run time
		
	}
}
