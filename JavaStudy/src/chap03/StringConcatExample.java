package chap03;

// 2022. 9 . 22. 21:25 ±èÃ¶Èñ

public class StringConcatExample { // 118p ¹®ÀÚ¿­ °áÇÕ ¿¬»êÀÚ.

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " Æ¯Â¡";
		System.out.println(str1); // JDK6.0
		System.out.println(str2); // JDK6.0 Æ¯Â¡

		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3); // JDK33.0
		System.out.println(str4); // 6.0JDK
	}

}
