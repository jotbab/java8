package sec2;

import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product pro1 = new Product();
		Product pro2 = new Product();
		Product pro3 = new Product();
		System.out.println("제품코드 : ");
		
		pro1.setPid(sc.next());
		System.out.println("제품명 :");
		pro1.setPname(sc.next());
		System.out.println("제품수량 : ");
		pro1.setAmount(sc.nextInt());
		System.out.println("가격 :");
		pro1.setPrice(sc.nextInt());
		System.out.println("상품이미지 :" );
		pro1.setImg(sc.next());
		System.out.println("제품코드\t제품명\t제품수량\t제품가격\t이미지");
		System.out.println(pro1.getPid()+"\t"+pro1.getPname()+"\t"+pro1.getAmount()+"\t"+pro1.getPrice()+"\t"+pro1.getImg());
		
		sc.close();
			
	}

}
