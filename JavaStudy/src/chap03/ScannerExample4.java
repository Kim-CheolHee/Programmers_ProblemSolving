package chap03;

import java.util.Scanner;

//2022. 9 . 22. 21:33 ��ö��

public class ScannerExample4 { // 96p ��ĳ�� ����

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸�: ");
		String b = a.nextLine();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String c = a.nextLine();
		System.out.print("3. ��ȭ��ȣ: ");
		String d = a.nextLine();
		System.out.println("");

		System.out.println("[�Է��� ����]");
		// System.out.println(b + "\n" + c + "\n" + d);
		System.out.println("�̸� : " + b);
		System.out.println("�ֹι�ȣ �� 6�ڸ� : " + c);
		System.out.println("��ȭ��ȣ : " + d);
		System.out.println("");

		while (true) {
			System.out.println("�Էµ� �ֹι�ȣ�� �´� �� ���̸� �Է��Ͻÿ�.");
			String e = a.nextLine();
			// int z= Integer.parseInt(e);
			// System.out.println("�� ���� : " + z);
			System.out.println("�� ���� : " + e);

//			if(z==30) {
//				break;
//			}
			if (e.equals("30")) {
				break;
			}
		}
		System.out.println("����.");
	}

}