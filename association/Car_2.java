package association;

public class Car_2 {
	Engine_2 engine;
	Tires[] tires = new Tires[4];

	Car_2() {

		this.engine = new Engine_2();
		for (int i = 0; i < 4; i++) {
			tires[i] = new Tires();
		}
	}
		public Engine_2 getEngine() {
			return this.engine;
		}

}
