package chap03;

import java.util.Scanner;

//2022. 9 . 22. 21:33 김철희

public class ScannerExample4 { // 96p 스캐너 예제

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String b = a.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String c = a.nextLine();
		System.out.print("3. 전화번호: ");
		String d = a.nextLine();
		System.out.println("");

		System.out.println("[입력한 내용]");
		// System.out.println(b + "\n" + c + "\n" + d);
		System.out.println("이름 : " + b);
		System.out.println("주민번호 앞 6자리 : " + c);
		System.out.println("전화번호 : " + d);
		System.out.println("");

		while (true) {
			System.out.println("입력된 주민번호에 맞는 만 나이를 입력하시오.");
			String e = a.nextLine();
			// int z= Integer.parseInt(e);
			// System.out.println("만 나이 : " + z);
			System.out.println("만 나이 : " + e);

//			if(z==30) {
//				break;
//			}
			if (e.equals("30")) {
				break;
			}
		}
		System.out.println("종료.");
	}

}