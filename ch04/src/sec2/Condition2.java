package sec2;

import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성명 : ");
		String name = sc.next();
		System.out.print("\n점수 : ");
		int jum = sc.nextInt();
		String pan="";
		if (jum>=90){
			pan="A";
		}else if (jum>=80){
			//조건식1을 만족하지 않으며, 조건식2가 만족될 때 실행할 문장
			pan="B";
		}else if (jum>=70){
			pan="C";
		}else if (jum>=60){
			pan="D";
		}else {
			//모든 조건을 만족하지 못할 때 실행할 문장
			pan="낙제";
		}
		System.out.print("당신의 이름은 " + name +"이며, + 점수는 " + jum + "이고, + 학점은 " + pan + "입니다.");
		sc.close();
	}

}
