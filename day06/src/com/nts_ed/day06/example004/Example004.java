package com.nts_ed.day06.example004;

public class Example004 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1-100の間の偶数の合計:" + sum);
	}

}

/*
2.for繰り返し文
2.4練習問題for繰り返し文練習‐偶然の合計を出す

問題要求：1-100の間の合計を出し、ターミナルで出力する
①1-100の偶数合計と、1-5の問題と大きな違いがない
	int sum = 0;
	for (int i = 1; i <= 100; i++) {
		sum += i;
	}

②1-100までの偶数合計を求めるので、合計操作に条件を追加
	int sum = 0;
	for (int i = 1; i <= 100; i++) {
		if(実行する条件) {
			sum += i;
		}
	}

③偶数である場合、計算を行うので、偶数かどうかの判定条件を追加
	int sum = 0;
	for (int i = 1; i <= 100; i++) {
		if(i%2==0) {
			sum += i;
		}
	}

④繰り返し終了後、以下の結果を出力する
	System.out.println("1-100の間の合計:" + sum );

*/