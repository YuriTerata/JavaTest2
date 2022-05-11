package jp.co.aforce.test;

public class MinMax {
	int minMax;

	int getMaxValue(int a, int b, int c) {
		if (a > b && a > c) {
			minMax = a;
		} else if (b > a && b > c) {
			minMax = b;
		} else {
			minMax = c;
		}
		return minMax;

		//		解答例
		//		int result = a;
		//		if (result < b) {
		//			result = b;
		//		}
		//		if (result < c) {
		//			result = c;
		//		}
		//		return result;

	}

	int getMinValue(int a, int b, int c) {
		if (a < b && a < c) {
			minMax = a;
		} else if (b < a && b < c) {
			minMax = b;
		} else {
			minMax = c;
		}
		return minMax;

		//		解答例
		//		int result = a;
		//		if (result > b) {
		//			result = b;
		//		}
		//		if (result > c) {
		//			result = c;
		//		}
		//		return result;
	}

}
