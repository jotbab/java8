package sec1;

public class Type3 {

	public static void main(String[] args) {
		String name = "kim";	//참조형이지만 완벽한 참조형이 아님
		char[] irum = {'k','i','m'};	
		String nick ="kim";	//
		String lans =new String("kim");	//문자열 변수
		System.out.println(name);
		System.out.println(irum);
		//System.out.println(name==irum);
		//System.out.println(name!=irum);	- 서로 비교대상이 될 수 없음
		System.out.println(name==nick);
		System.out.println(name!=nick);
		System.out.println();
		System.out.println(name==lans);	//서로 같지 않음
		System.out.println(name!=lans);
		System.out.println();
		System.out.println(name.equals(lans));
		System.out.println(!name.equals(lans));
		//객체타입이 달라도 값만 비교해야 할 경우 equals()를 사용해야함
		
		System.out.println();
		String k = new String();
		System.out.println(k=="");
		System.out.println("----------------------");
		System.out.println(k.isEmpty());
	}

}
