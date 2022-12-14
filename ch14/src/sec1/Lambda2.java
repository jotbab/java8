package sec1;
//함수적 인터페이스 - 하나의 인터페이스는 하나의 메소드만 추상체로 정의할 수 있음
@FunctionalInterface	//실수로 두 개 이상의 추상 메소드 선언 방지

interface Calc1 {	//매개변수X, 리턴X
	public void method1();
}

@FunctionalInterface

interface Calc2 {	//매개변수O, 리턴X	-	Consumer
	public void method2(int x, int y);
}

@FunctionalInterface

interface Calc3 {	//매개변수X, 리턴O	-	Supplier
	public int method3();
}

@FunctionalInterface

interface Calc4 {	//매개변수O, 리턴O	-	Operator 매개값 연산 결과와 리턴값이 같음		//Function - 매개값을 리턴값으로 매핑(타입변환)
	public int method4(int x, int y);
}



public class Lambda2 {

	public static void main(String[] args) {	
		//인터페이스명 객체명 = (매개변수) -> 리턴값
		Calc4 max = (x, y) -> x>y ? x : y;	//구현체 등록
		int data = max.method4(20, 18);
		System.out.println("최대값 : "+data);
	}

}
