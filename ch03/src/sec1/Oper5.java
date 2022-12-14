package sec1;

public class Oper5 {

	public static void main(String[] args) {
		//비트(2진) 연산			2진수(0,1) 1의 보수(complement==not) 0->1 1->0	음수 처리를 위해
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);
		h = c ^ d;
		System.out.println("c & d =>"+e);	//2진수 and ->8
		System.out.println("c | d =>"+f);	//2진수 or ->62
		System.out.println("~(c & d) =>"+g);	//2진수 보수 ->-9
		System.out.println("c ^ d =>"+h);	//배타적 OR(eXcluesive OR) ->54
		System.out.println("d >> 2"+(d >> 2));	//오른쪽 시프트(Shift) ->210
		System.out.println("d << 2 =>"+(d << 2));	//왼쪽 시프트(Shift) -> 160
		System.out.println("d >>> 2 =>"+(d >>> 2));	//오른쪽 이동 시프트 ->10
		System.out.println("d <<< 2 는 존재하지 않음");		//왼쪽 이동시프트는 연산자가 없음
		//연산시 부정과 불능 그리고 예외처리
		//System.out.println(a / 0);	//Not a Number => NaN(부정)
		//System.out.println("k" /0);	//
		System.out.println('k' / 4);
		//System.out.println(a * 0);	//Infinity(불능)
		try {	//예외처리
			int k=20;
			System.out.println(a / 0);	//실행해야할 구문
	} catch (ArithmeticException e1){	//실행해야할 구문이 오류 발생시 처리해야할 내용
		System.out.println("산술연산에 오류가 존재함");
	}
	
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);
		
		
		
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (((lengthTop+lengthBottom)/2*height));
		System.out.println(area);
}}
