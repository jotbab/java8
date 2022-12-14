package sec2;

public class Car {
	String name;	//멤버 필드: 객체(인스턴스)가 가지는 특성을 저장
	String fuel;
	int cc;
	int speed;
	final static int MAX_SPEED = 500;	//멤버 상수 : 값이 한 곳에 저장되어 더 이상 바뀌지 않음 상수는 보통 대문자로 작성한다
	final static int MIN_SPEED = 0;
	//[접근제한자]	[수정자]	데이터타입 필드명;
	
	public Car() { }
	public Car(String name){ this.name = name; }
	public Car(String name, String fuel){ this.name = name; this.fuel = fuel; }
	public Car(String name, String fuel, int cc){ 
		this(name, fuel, cc, 0);
	}
	public Car(String name, String fuel, int cc, int speed){
		this.name = name;	this.fuel=fuel;
		this.cc = cc;	this.speed = speed;
	}
	//생성자(Constructor) : 객체를 만드는 함수
	//[접근제한자] 클래스명 (데이터타입 매개변수,....){ }
	//this = 현재 객체, this() = 생성자 함수
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//Method : 객체의 활동, 행위, 기능
	//[접근제한자] 반환타입 메서드명([데이터타입 매개변수]) { 활동/행위/기능 }
	//getter Method : 현재 객체의 속성(멤버필드)에 저장된 데이터값을 가져오기
	//setter Method : 현재 객체의 속성(멤버필드)에 값을 저장하기
	
	public void bootUp() {
		System.out.println("시동을 켭니다.");
	}
	public void bootOff() { 
		System.out.println("시동을 끕니다.");
	}
	public int speedUp(){	//반환 타입이 int이므로 return 해주어야 하는 것은 정수이어야 함
		System.out.println("가속");
		if(this.speed<this.MAX_SPEED){
		this.speed=this.speed+10;
		}
		return this.speed;
	}
	public int speedDown(){
		System.out.println("급브레이크");
		if(this.speed>this.MIN_SPEED){
		this.speed=this.speed-1;
		}
		return this.speed;
	}
	
	public int speedInfo(){
		return speed;
		
	}
	public String fuelInfo(){
		return fuel;
	}
	
}
