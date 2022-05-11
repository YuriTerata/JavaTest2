package jp.co.aforce.test;

public class PracticeTest1 {
	private static final double TAX = 0.1;

	public static void main(String[] args) {

		//練習問題1
		System.out.println(TAX);

		//練習問題2
		int x = 480;
		int price = (int) (x * (1 + TAX));
		System.out.println("この商品の値段は" + price + "円です");

		//練習問題3
		String name = "寺田優里";
		System.out.println(name);

		//練習問題4
		//クラスやフィールド、メソッドなどが他の場所から見える「範囲」を
		//制限するもの。読みやすいプログラムにすることができる。

		//練習問題5
		//デフォルト
		//※protectedではない

	}

}
