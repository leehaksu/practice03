package prob06;

public class Div {
	private int a;
	private int b;

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
