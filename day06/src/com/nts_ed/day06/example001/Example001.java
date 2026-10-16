package com.nts_ed.day06.example001;

public class Example001 {

	public static void showInfo() {
		// TODO 自動生成されたメソッド・スタブ
		//式
		int x = 10;//ステートメント
		int y = 3;

		String a = new String("日本の");
		String b = new String("おもてなし");
		if (a.equals(b)) {
			System.out.println("同じ");
		}

		System.out.println("ｘ * y =" + multiple(x, y));
		System.out.println("a + b =" + concat(a, b));
	}

	public static int multiple(int x, int y) {
		return x * y;

	}

	public static String concat(String a, String b) {
		return a + b;
	}

//	//ブロック
//	private int calc(boolean isAdd, int x, int y) {
//		int result = 0;
//		test = 1;
//		if (isAdd) {
//			test = 2;
//			result = x + y;
//			if(test == 3) {
//				int test2 = 3;
//				
//			}
//		}
//		System.out.println(test2);
//	
//	} else {
//		result = x - y;
//		}
//		return resuit;
//	}
	
	//列挙型　
	enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }

}
