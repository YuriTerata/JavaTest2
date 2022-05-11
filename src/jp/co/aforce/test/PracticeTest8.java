package jp.co.aforce.test;

public class PracticeTest8 {

	//練習問題1
	public void printHello() {
		System.out.println("Hello");
	}

	//練習問題2
	public void printRandomMessage() {
		int n = (int) (3 * Math.random());
		if (n == 0) {
			System.out.println("こんばんは");
		} else if (n == 1) {
			System.out.println("こんにちは");
		} else {
			System.out.println("おはよう");
		}
		//switch文でも可能
	}

	//練習問題3
	public void printMessage(String message) {
		System.out.println(message);
	}

	//練習問題4
	public void printMessage(String message, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	//練習問題5
	public void printRectangleArea(double height, double width) {
		System.out.println("高さ:" + height + "横幅:" + width + "面積:" + (height * width));
	}

	//練習問題6
	String getWeatherForecast() {
		int x = (int) (3 * Math.random());
		int y = (int) (4 * Math.random());
		String day;
		String weather;

		if (x == 0) {
			day = "今日";
		} else if (x == 1) {
			day = "明日";
		} else {
			day = "明後日";
		}

		if (y == 0) {
			weather = "晴れ";
		} else if (y == 1) {
			weather = "曇り";
		} else if (y == 2) {
			weather = "雨";
		} else {
			weather = "雪";
		}
		String message = day + "の天気は" + weather + "でしょう";
		return message;
	}

	//練習問題7
	public boolean isEvenNumber(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	//練習問題8
	String getMessage(String name, boolean isKid) {
		String message;
		if (isKid) {
			message = "こんにちは。" + name + "ちゃん。";
		} else {
			message = "こんにちは。" + name + "さん。";
		}
		return message;
	}

	//練習問題9
	public String getLongestString(String[] array) {
		String MaxLength = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() >= MaxLength.length()) {
				MaxLength = array[i];
			}
		}
		return MaxLength;
	}

	//練習問題10
	public boolean isAdult(Person person) {
		if (person.getAge() >= 20) {
			return true;
		} else {
			return false;
		}
	}

}
