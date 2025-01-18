package myTest;
// 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요

public class MyTest {
	public static void main(String[] args) {
		int answer = 0;
		int num = 98;
		int n = 2;

		if (num % n == 0) {
			answer = 1;
		} else {
			answer = 0;
		}
		System.out.println(answer);

	}
}
