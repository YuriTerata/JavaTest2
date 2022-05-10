package jp.co.aforce.test;

public class PracticeTest8 {

	//練習問題1
	public void printHello() {
		System.out.println("Hello");
	}

	//練習問題2
	void printRandomMessage() {
		int n = (int) (3 * Math.random());
		if (n == 0) {
			System.out.println("こんばんは");
		} else if (n == 1) {
			System.out.println("こんにちは");
		} else {
			System.out.println("おはよう");
		}
	}

	//練習問題3
	void printMessage(String message) {
		System.out.println(message);
	}

	//練習問題4
	void printMessage(String message, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	//練習問題5
	void printRectangleArea(double height, double width) {
		System.out.println("高さ:" + height + "横幅:" + width + "面積:" + (height * width));
	}

	//練習問題6
	String getWeatherForecast() {
		int i = (int) (3 * Math.random());
		int j = (int) (4 * Math.random());
		String day;
		String weather;

		if (i == 0) {
			day = "今日";
		} else if (i == 1) {
			day = "明日";
		} else {
			day = "明後日";
		}

		if (j == 0) {
			weather = "晴れ";
		} else if (j == 1) {
			weather = "曇り";
		} else if (j == 2) {
			weather = "雨";
		} else {
			weather = "雪";
		}
		String message = day + "の天気は" + weather + "でしょう";
		return message;
	}

	//練習問題7
	boolean isEvenNumber(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	//練習問題8
	String getMessage(String name, boolean isKid) {
		String message;
		if (isKid == true) {
			message = "こんにちは。" + name + "ちゃん。";
		} else {
			message = "こんにちは。" + name + "さん。";
		}
		return message;
	}

	//練習問題9
	String getLongestString(String[] array) {
		String MaxLength = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() >= MaxLength.length()) {
				MaxLength = array[i];
			}
		}
		return MaxLength;
	}

	//練習問題10
	static boolean isAdult(Person person) {
		if (person.getAge() >= 20) {
			return true;
		} else {
			return false;
		}
	}

}
