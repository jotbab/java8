package ccc;

public class Ex1 {

	public static void main(String[] args) {
		//구구단을 출력하는 문제
		//이중 for문을 활용하여 아래와 같이 구구단을 출력
		
		for(int i=2;i<=9;i++){
			for(int j=1;j<=9;j++){
				
				System.out.print(i+"X"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
