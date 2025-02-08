package test;

class Car {
	private String name;
	private String engineType;
	private int wheels;
	private float price;

	private Car(CarBuilder builder) {
		this.name = builder.name;
		this.engineType = builder.engineType;
		this.wheels = builder.wheels;
		this.price = builder.price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engineType=" + engineType + ", wheels=" + wheels + ", price=" + price + "]";
	}

	public static class CarBuilder{
		private String name;
		private String engineType;
		private int wheels;
		private float price;
		
		public CarBuilder setName( String name ) {
			this.name = name;
			return this;
		}
		
		public CarBuilder setEngineType( String engineType ) {
			this.engineType = engineType;
			return this;
		}
		
		public CarBuilder setWheels( int wheels ) {
			this.wheels = wheels;
			return this;
		}
		
		public CarBuilder setPrice( float price ) {
			this.price = price;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}
}

public class Program1 {
	public static void main(String[] args) {
		
			Car car = new Car.CarBuilder()
					.setName("Lambo")
					.setEngineType("Machine")
					.setWheels(5)
					.setPrice(20000000.0f)
					.build();
			
			System.out.println(car);
	}
}
