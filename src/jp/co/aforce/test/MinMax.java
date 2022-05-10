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
	}

}
