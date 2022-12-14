package sec4;
//String 클래스에 속하는 메서드
public class StringEx1 {

	public static void main(String[] args) {
		
		String str1 = new String("KimGiTae");
		
		System.out.println("Str1="+str1);
		System.out.println("네 번째 글자 : "+str1.charAt(3));	//n번째 글자 .charAt(n-1)
		System.out.println("문자열 비교 : "+str1.equals("KimKitae"));	//문자열 비교 .equals("비교대상")
		
		byte[]	char1 = str1.getBytes();
		System.out.println("char1은 문자열을 한 글자씩 분리 : "+char1);	//
		charPrint(char1);
		int a = (char)str1.indexOf("i");	//해당 문자를 찾기
		System.out.println("i는 몇 번째 ? : "+a);	//문자가 중복 될 경우 가장 먼저 찾은 문자의 위치
		String data = str1.substring(3, 5);
		System.out.println("인덱스가 3부터 5전 까지 : "+data);
		System.out.println(str1.toLowerCase());		//.toLowerCase 문자열을 소문자로
		System.out.println(str1.toUpperCase());		//.toUpperCase 문자열을 대문자로
		String name = "    My name is Kitae, Kim";
		System.out.println("글자수 출력 : "+ name.length());
		System.out.println("공백 제거 전 : "+ name);
		System.out.println("공백 제거 후 : "+ name.trim());		//.trim 문자열 전 후 공백 제거
		System.out.println("공백 제거 후 글자수 : " + name.trim().length());
		
		int b = 1004;
		String.valueOf(b);		//String.valueOf() 각종 데이터를 문자데이터로 변환
		System.out.println(String.valueOf(b)+1004);
		System.out.println(b+1004);
		System.out.println();
		System.out.println("2진수로 변환 : "+Integer.toBinaryString(b));	//Integer.toBinaryString() 2진수로 변환
		System.out.println("8진수로 변환 : "+Integer.toOctalString(b));		//Integer.toOctalString()	8진수로 변환
		System.out.println("16진수로 변환 : "+Integer.toHexString(b));		//Integer.toHexString()		16진수로 변환
		System.out.println();
		String c1 = "1111101100";
		String c2 = "1754";
		String c3 = "3ec";
		System.out.println("10진수로 변환 : "+Integer.valueOf(c1, 2));
		System.out.println("10진수로 변환 : "+Integer.valueOf(c2, 8));
		System.out.println("10진수로 변환 : "+Integer.valueOf(c3, 16));
		String str2 = str1.replace("K", "L");	// .replace("바꿀대상", "바꿀 내용")'  
		System.out.println(str2);
		String str3 = str1.replace("Kim", "Lee");	//문자열도 가능
		System.out.println(str3);
	}
	
	static void charPrint(byte[] data){
		
		for(int i=0;i<data.length;i++){
			char a = (char) data[i];
			System.out.print(a);
		}
		System.out.println();
	}
}
