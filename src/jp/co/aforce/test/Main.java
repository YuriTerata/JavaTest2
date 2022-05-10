package jp.co.aforce.test;

public class Main {
	//練習問題11
	public static void main(String[] args) {

		PracticeTest8 test8 = new PracticeTest8();

		test8.printHello();
		test8.printRandomMessage();
		test8.printMessage("Hello");
		test8.printMessage("Hello", 5);
		test8.printRectangleArea(6, 8.2);
		System.out.println(test8.getWeatherForecast());
		System.out.println(test8.isEvenNumber(5));
		System.out.println(test8.getMessage("yuri", true));
		String[] array = { "ケーキ", "マカロン", "フロランタン", "パフェ" };
		System.out.println(test8.getLongestString(array));

		System.out.println(PracticeTest8.isAdult(new Person("寺田優里", 22)));

	}

}
