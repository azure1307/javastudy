package test0319;

import java.util.Scanner;

/*
 * 10부터 99사이의 두자리 자연수를 입력받아 입력된 수 보다 크거나 
 * 같은 10의 배수를 구하기
 * 10의 배수에서 입력된 수를 뺀값을 출력하기
 * [결과]
 * 10부터 99사이의 두자리 자연수를 입력하세요
 * 24
 *  6  :  30 - 24
 *  
 * 10부터 99사이의 두자리 자연수를 입력하세요
 * 20
 * 0   :  20 - 20
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10부터 99 사이의 두 자리 자연수를 입력하세요");
		int input = sc.nextInt();
		
		int a = ((input%10!=0)?1:0);
		int num1 = ((input/10)+a)*10;
		System.out.println((num1-input) + " : " + num1 + " - " + input);
	}
}