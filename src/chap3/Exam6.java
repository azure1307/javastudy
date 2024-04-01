package chap3;

import java.util.Scanner;
/*
 * 사과의 갯수를 입력받아 필요한 바구니수 계산하기
 * 바구니당 10개의 사과를 저장할 수 있다고 가정
 * 
 * [결과]
 * 사과의 갯수를 입력하세요
 * 21
 * 필요한 바구니갯수: 3개
 */
public class Exam6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사과의 갯수를 입력하세요");
		int apple = sc.nextInt();
		int backet = apple%10==0?apple/10:(apple/10)+1;
		System.out.println("필요한 바구니갯수: " + backet + "개");
	}

}
