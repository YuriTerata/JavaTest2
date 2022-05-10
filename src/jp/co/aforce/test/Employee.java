package jp.co.aforce.test;

public class Employee {

	//練習問題3
	private int number;
	private String name;
	private String gender;
	private int age;

	void setData(int number, String name, String gender, int age) {
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	int getNumber() {
		return number;
	}

	String getName() {
		return name;
	}

	String getGender() {
		return gender;
	}

	int getAge() {
		return age;
	}

}
