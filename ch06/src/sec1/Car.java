package sec1;

public class Car {
	String company;
	String model;
	private String color;
	private int maxSpeed;
	int speed;
	int rpm;
	Body body;
	Engine engine;
	Tire tire;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
