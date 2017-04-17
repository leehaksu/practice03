package prob06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] str2= new String [3];
		while (true) {
			/* 코드를 완성 합니다 */
			String str= scanner.nextLine();
			StringTokenizer st = str.nextToken();

		/*
		 * scanner.close();
		 */
	}

}

class Add {
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;

	}

	int Calculator() {

		return a + b;

	}
}

class sub {
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int Calculator() {
		if (a > b) {
			return a - b;
		} else {
			return b - a;
		}

	}

}

class Mul {
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int Calculator() {
		
		return a*b;

	}

}

class div {
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int Calculator() {
		if(b==0)
		{
			System.out.println("계산이 불가능합니다.");
			return b;
		}else
		{
			return a/b;
		}
		

	}

}
