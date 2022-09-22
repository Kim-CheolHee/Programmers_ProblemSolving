package sec01.exam03;

// 2022. 9. 16. 21:14 김철희

public class VariableExchangeExample { // 변수값 교환.

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x; // x=3, y=5, temp=3
		x = y; // x=5, y=5, temp=3
		y = temp; // x=5, y=3, temp=3
		System.out.println("x:" + x + ", y:" + y);
		
	}

}
