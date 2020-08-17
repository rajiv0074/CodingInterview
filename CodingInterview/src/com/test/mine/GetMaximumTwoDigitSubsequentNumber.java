package com.test.mine;

/*
 * intput = "1" -> output -> 1 intput = "23" -> output -> 23 intput =
 * "123239576" -> output -> 95
 */
public class GetMaximumTwoDigitSubsequentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123239576";
		System.out.println(solution(str));
	}

	public static int solution(String S) { // write your code in Java SE 8 int
		int max = 0;
		if (S.length() > 0) {
			if (S.length() < 3) {
				return Integer.parseInt(S);
			}
			for (int i = 0; i < S.length() - 1; i++) {
				if (max < Integer.parseInt(S.substring(i, i + 2))) {
					max = Integer.parseInt(S.substring(i, i + 2));
				}
			}
		}
		return max;

	}

}
