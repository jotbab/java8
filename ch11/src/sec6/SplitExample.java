package sec6;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {

		String str = "아이디,이름,패스워드";
		
		//split 메서드 이용
		// .split 문자열을 배열요소로 형변환
		String[] str_1 = str.split(",");	// | 를 구분자로 
		
		for(int i=0;i<str_1.length;i++){
			System.out.println(str_1[i]);
		}
		System.out.println();
		
		
		
		//StringTokenizer 이용
		StringTokenizer str_2 = new StringTokenizer(str, ","); 			//StringTokenizer(변수명, 구분자)
		int cntToken = str_2.countTokens();	//토큰에 의해 발생된 요소의 수
		for(int i=0;i<cntToken;i++){
			String token = str_2.nextToken();
			System.out.println(token);
		}
		
		
		
		
		
	}

}
