package sec4;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		
		int balance = 0;
		int money = 0;
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run){
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택> ");
			
			int number=sc.nextInt();
			switch(number){
				case 1 : System.out.print("예금액>");
				money=sc.nextInt();
				balance+=money;
				break;
				
				case 2 : System.out.print("출금액>");
				money=sc.nextInt();
				balance=-money;
				break;
				
				case 3 : System.out.print("잔고>"+balance);
				break;
				
				case 4 :
					run=false;
					System.out.print("프로그램 종료");
					break;
				}
			sc.close();
			
			
		}
	}

}
