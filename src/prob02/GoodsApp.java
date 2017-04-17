package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for (int i = 0; i < COUNT_GOODS; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int countStock = scanner.nextInt();
			Goods goods2 = new Goods();
			goods2.setName(name);
			goods2.setCount(countStock);
			goods2.setPrice(price);
			goods[i]=goods2;
			
		}
		
		for(int i=0;i<goods.length;i++)
		{
			System.out.println(goods[i].getName()+"(가격은 : "+goods[i].getPrice()+"원)이 "+goods[i].getCount()+"개 입고되었습니다.");
			
		}
		
		// 자원정리
		scanner.close();
	}
}
