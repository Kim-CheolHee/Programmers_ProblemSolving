package sec03.exam02;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		while (true) {
			System.out.println("첫번째 숫자를 입력하세요.");
			String b = a.nextLine();
			System.out.println("두번째 숫자를 입력하세요.");
			String c = a.nextLine();
			int d = Integer.parseInt(b) + Integer.parseInt(c);
			System.out.println("Result : " + d);
			// String e = a.nextLine();
			if (d == 10) {
				break;
			}
		}
		System.out.println(" 종료.");
	}

}
