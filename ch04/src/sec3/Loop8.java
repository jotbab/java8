package sec3;

public class Loop8 {

	public static void main(String[] args) {
		// 이중 for문을 활용하여 아래와 같은 형태의 구구단을 출력
/*
 * 	2*1=2	3*1=3 ,.......... 9*1=9
 * 	2*2=4	3*2=6 ,................
 *  ...............................
 *  2*9=18	,.................9*9=81	
 */
		for(int i=1;i<10;i++) {
			for(int k=2;k<10;k++) {
				System.out.print(k+"*"+i+"="+(i*k)+"\t");
			}
			System.out.println( );
		}
		System.out.println("\t");
		System.out.println("수열 - 팩토리얼의 합계 출력");
		
		int mul = 1;
		long res = 0;
		for(int a=1;a<11;a++){
				mul*=a;
				res+=mul;}
				System.out.println(+mul);
			
		
		
		
		
		
		
	}
}