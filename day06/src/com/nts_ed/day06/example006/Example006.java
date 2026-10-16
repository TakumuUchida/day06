package com.nts_ed.day06.example006;

public class Example006 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// ナルシシスト数の個数 
		int count = 0;

		// 100～999まで繰り返す 
		for (int i = 100; i < 1000; i++) {

			// 一の位 
			int a = i % 10;

			// 十の位 
			int b = i / 10 % 10;

			// 百の位 
			int c = i / 100;

			// ナルシシスト数か判定 
			if (a * a * a + b * b * b + c * c * c == i) {
				// ナルシシスト数を表示 
				System.out.println(i);
				// 個数を1増やす 
				count++;
			}
		}

		// ナルシシスト数の個数を表示 
		System.out.println("ナルシシスト数：" + count + "個");
	}
}

/*
2.for繰り返し文
2.6練習問題for繰り返し文練習‐統計

問題要求：ナルシシスト数の個数を算出、ターミナルで出力
分析:
①ナルシシスト数を保存するため、変数countを宣言、初期値は0
	int count = 0;
	
②ナルシシスト数を判定時、条件を満たす場合、出力終了、countの値になり、count+1のように
	if(a*a*a+b*b*b+c*c*c == 元の数値) {
		count++;
	}
	
③結果を出力
	System.out.println("ナルシシスト数:" + count + "個" );


*/