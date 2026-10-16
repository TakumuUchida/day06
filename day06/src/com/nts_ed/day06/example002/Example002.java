package com.nts_ed.day06.example002;

public class Example002 {

	public static void showInfo() {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}


/*問題要求：ターミナルで1-5の数値を出力する
①繰り返し出力になるため、繰り返し文を使う
for(初期化処理文; 繰り返し条件文; 繰り返し処理文)　{
}

②1開始5終了により、初期化は１になる
	for(int i = 1; 繰り返し条件文; 繰り返し処理文)　{
}

③1から5まで終了、繰り返し条件文で５まで到達しない場合、継続的に実行、5が越えたら終了
	for(int i = 1; i <=5; 繰り返し処理文)　{
}

④1から5であるので、毎回１を笛、繰り返し処理分で毎回１を増えることを設定
	for(int i = 1; i <=5; i++)　{
}

⑤繰り返し実行する内容(ブロック)を繰り返し文に記入、結果を出力
	for(int i = 1; i <=5; i++)　{
	System.out.println(i);
}
*/
