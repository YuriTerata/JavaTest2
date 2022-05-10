package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class PracticeTest3 {
	public static void main(String[] args) {

		//練習問題1
		String[] Tanaka = { "1", "田中太郎", "男性", "27" };

		//練習問題2
		System.out.println(Tanaka[1]);

		//練習問題4
		Employee TanakaData = new Employee();
		TanakaData.setData(1, "田中太郎", "男性", 27);

		Employee SatoData = new Employee();
		SatoData.setData(2, "佐藤花子", "女性", 22);

		Employee SuzukiData = new Employee();
		SuzukiData.setData(3, "鈴木次郎", "男性", 31);

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(TanakaData);
		employees.add(SatoData);
		employees.add(SuzukiData);

		for (Employee employee : employees) {
			System.out.println(
					"番号は" + employee.getNumber() + "、名前は" + employee.getName() + "、年齢は" + employee.getAge() + "歳です。");
		}

		//練習問題5
		HashMap<String, String> Subjects = new HashMap<>();
		Subjects.put("国語", "90");
		Subjects.put("数学", "80");
		Subjects.put("英語", "65");

		for (Entry<String, String> subject : Subjects.entrySet()) {
			System.out.println(subject.getKey() + ":" + subject.getValue());
		}

		//練習問題6
		//マップはキーを目印にして値を探すことができるので
		//科目から点数を導き出しやすいと考えたから。

	}

}
