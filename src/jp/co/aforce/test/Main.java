package jp.co.aforce.test;

public class Main {
	//練習問題11
	public static void main(String[] args) {

		PracticeTest8 test8 = new PracticeTest8();

		//練習問題1
		test8.printHello();

		//練習問題2
		test8.printRandomMessage();

		//練習問題3
		test8.printMessage("Hello");

		//練習問題4
		test8.printMessage("Hello", 5);

		//練習問題5
		test8.printRectangleArea(6, 8.5);

		//練習問題6
		System.out.println(test8.getWeatherForecast());

		//練習問題7
		System.out.println(test8.isEvenNumber(6));

		//練習問題8
		System.out.println(test8.getMessage("yuri", true));

		//練習問題9
		String[] array = { "ケーキ", "マカロン", "フロランタン", "パフェ" };
		System.out.println(test8.getLongestString(array));

		//練習問題10
		System.out.println(test8.isAdult(new Person("寺田優里", 22)));

	}

}
