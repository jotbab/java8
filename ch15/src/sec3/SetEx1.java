package sec3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		/* */
		Set<String> set1 = new HashSet<String>();
		set1.add("김연정");
		set1.add("남송윤");
		set1.add("강병수");
		set1.add("김기태");
		set1.add("남송윤");
		set1.add("유광현");
		set1.add("김기태");
		System.out.println(set1);	//set은 중복허용 X
		System.out.println("찾을사람입력");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		if(set1.contains(name)){
			System.out.println("해당 데이터가 존재합니다");
		}
		System.out.println("건수 : "+set1.size());
	}
	
}
