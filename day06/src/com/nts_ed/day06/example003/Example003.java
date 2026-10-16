package com.nts_ed.day06.example003;

public class Example003 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
		}
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println("1-5の合計:" + sum);
	}

}

/*
2.for繰り返し文
2.3練習問題for繰り返し文練習‐合計を出す

問題要求：1-5の合計をターミナルで出力する
①合計を出す場合、最終結果を保存するため、変数を宣言する、初期値は０
	int sum = 0;

②1-5までの数値を準備、繰り返し処理完成
	for (int i = 1; i <= 5; i++) {
	}

③繰り返ししたら実行する内容を繰り返し処理の内部に記入、iの値を最終合計の値を変数に保存
	for (int i = 1; i <= 5; i++) {
		sum += i;
	}

④最終結果を出力する
	System.out.println("1-5の合計:" + sum );

*/