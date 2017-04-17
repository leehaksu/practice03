package prob06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str2 = new String[3];
		while (true) {
			/* 코드를 완성 합니다 */
			System.out.println(">>");
			String str = scanner.nextLine();
			if(str.equals("quit"))
			{
				break;
			}
			String[] token = str.split(" ");
			int value1 = Integer.parseInt(token[0]);
			int value2 = Integer.parseInt(token[2]);

			switch (token[1]) {
			case "+":
				Add add = new Add();
				add.setValue(value1, value2);
				int result=add.Calculator();
				System.out.println(">>"+result);
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(value1, value2);
				result=sub.Calculator();
				System.out.println(">>"+result);
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(value1, value2);
				result=mul.Calculator();
				System.out.println(">>"+result);
				break;
			case "/" :
				Div div = new Div();
				div.setValue(value1, value2);
				result=div.Calculator();
				System.out.println(">>"+result);
				break;
			}

		}

	}
}
