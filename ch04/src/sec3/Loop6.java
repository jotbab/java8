package sec3;

public class Loop6 {

	public static void main(String[] args) {
		int tot = 0;
		for(int i=0;i<=100;i++){//101번 실행
			tot+=i;
		}
		System.out.println("0~100 합계 : "+tot);
		
		tot=0;
		for(int i=0;i<=100;i+=2){
			tot+=i;
		}
		System.out.println("0~100 중 짝수의 합계1 : " +tot);
		
		tot=0;
		for(int i=1;i<=100;i+=2){
			tot+=i;
		}
		System.out.println("0~100 중 홀수의 합계 : " + tot);
		
		int n=1;
		tot=0;
		for(int i=1;i<=100;i+=2){
			tot+=i;
		}
		System.out.println("0~100 중 홀수의 합계2 : "+tot);
		
		
	}

	
}
