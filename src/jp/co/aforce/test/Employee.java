package jp.co.aforce.test;

public class Employee {

	//練習問題3
	//フィールド
	private int number;
	private String name;
	private String gender;
	private int age;

	//コンストラクター
	Employee(int number, String name, String gender, int age) {
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	//外部から扱えるようにするためpublicを使うことが多い
	//右クリック→ソースからgetter,setterの生成
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
