package sec2;

import java.util.Date;
import java.util.Scanner;

public class Board2Ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//임의의 Board 객체배열 100개 생성
		Board2[] board = new Board2[100];
		for(int i=0; i<board.length;i++){	//객체의 배열은 선언 및 초기화가 필요
			board[i] = new Board2();
		}
		
		boolean sw = true;	//작업 계속 여부
		int cnt = 0;	//배열의 개수 카운트
		
		while(sw){
			System.out.println("작업번호 입력: ");
			int job = sc.nextInt();
			int idx;
			String title;
			String content = null;
			String author = null;
			switch(job){
				case 1:
					System.out.println("*** 입력작업 ***");
					System.out.println("제목 : ");
					title = sc.next();
					System.out.println("내용 : ");
					content = sc.next();
					Date date = new Date();
					board[cnt].boardWrite (cnt, title, content, author, date);
					cnt++;
					break;
				case 2:
					System.out.println("*** 수정작업 ***");
					System.out.println("글 번호 : ");
					idx = sc.nextInt();
					System.out.println("제목 : ");
					title = sc.next();
					for(int a=0;a<=cnt;a++){
						board[a].boardUpdate(idx, title, content);
					}
					break;
				case 3:
					System.out.println("*** 삭제작업 ***");
					System.out.println("글 번호 : ");
					idx = sc.nextInt();
					for(int a=0;a<=cnt;a++){
						board[a].boardDelete(idx);
					}
					break;
				case 4:
					System.out.println("*** 검색작업 ***");
					System.out.println("글 번호 : ");
					idx = sc.nextInt();
					for(int a=0;a<cnt;a++){
						board[a].boardSearch(idx);
					}
					
					
					
					
				default:
					System.out.println("프로그램 종료");
					sw = false;
					
					
					
					
					
					
			}
		}
		sc.close();
		

		
		
		
		
		
		
		
		
	}

}
