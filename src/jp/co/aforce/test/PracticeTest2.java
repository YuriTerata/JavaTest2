package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {
	public static void main(String[] args) {

		int x = 10;
		int y = 28;
		double z = 3.14;

		//練習問題1
		System.out.println(x * y);

		//練習問題2
		System.out.println(y / x);
		System.out.println(y % x);

		//練習問題3
		double product = y * z;
		System.out.println(product);

		//練習問題4
		System.out.println(++product);

		//練習問題5
		int age = 22;
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(100);
		System.out.println("randomNumber=" + randomNumber);

		if (age > randomNumber) {
			System.out.println("私の方が年上です");
		} else if (age < randomNumber) {
			System.out.println("私の方が年下です");
		} else {
			System.out.println("私と同い年です");
		}

	}

}
