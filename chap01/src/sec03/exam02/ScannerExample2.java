package sec03.exam02;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		while (true) {
			System.out.println("ù��° ���ڸ� �Է��ϼ���.");
			String b = a.nextLine();
			System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
			String c = a.nextLine();
			int d = Integer.parseInt(b) + Integer.parseInt(c);
			System.out.println("Result : " + d);
			// String e = a.nextLine();
			if (d == 10) {
				break;
			}
		}
		System.out.println(" ����.");
	}

}
