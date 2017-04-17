package prob06;

public class Sub {
	private int a;
	private int b;

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
