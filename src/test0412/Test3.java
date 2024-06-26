package test0412;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
화면에서 여러개의 자연수를 입력받아(0을 입력시 입력종료) 이들 중 
홀수 인 자연수들만 이루어진 List 객체에 저장 
List  객체의 요소의 합을 구하고,
홀수 중 최대값, 최소값, 중간값 을 찾는 프로그램을 작성하기
단 자연수가 아닌 경우가 입력되면 무시한다.
홀수 들로만 이루어진 List 객체를 생성하여 출력하기

최대값과 최소값 :
Collections.max(list)와 Collections.min(list) 함수를 이용한다
중간값 :
 요소의 갯수가 홀수인 경우 : 가운데 값
 요소의 갯수가 짝수인 경우 : 가운데 값 2개의 평균
*/
public class Test3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		System.out.println("자연수를 입력하세요. 종료(0)");
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				int num = sc.nextInt();
				if (num == 0) break;
				// 홀수인 자연수만 추가(2로 나눈 나머지 1 && 0보다 큼)
				if (num%2==1 && num>0) {
					list.add(num);
					sum += num;
				}
			} catch (InputMismatchException e) {
				// 근데 이러면 마지막 아닌 위치에 문자열넣으면 안댐...
				// break;가 아니라 sc.next(); 사용!!
				sc.next();
			}
		}
//		for (Integer i:list) {
//			sum += i;
//		}
		
		System.out.println(list+"의 합:"+sum);
		System.out.println("홀수의 최대값:"+Collections.max(list));
		System.out.println("홀수의 최소값:"+Collections.min(list));
		System.out.println("홀수의 최대값 위치:"+list.indexOf(Collections.max(list)));
		System.out.println("홀수의 최소값 위치:"+list.indexOf(Collections.min(list)));
		System.out.println("입력된 홀수 목록:"+list);
		
		// 중간값이 이상함.. -> 중간값 구하려면 꼭 정렬해야함!!
		Collections.sort(list);
		double middle = 0;
		if (list.size()%2==1) {
			middle = list.get(list.size()/2);
		} else {
			middle = (list.get(list.size()/2-1)+list.get(list.size()/2))/2.0;
		}
		System.out.println("중간값:"+middle);
	}
/*
 *  [결과]
자연수를 입력하세요 종료(0)
12 77 38 41 53 92 85 aaa 0
[77, 41, 53, 85]의 합:256
홀수의 최대값:85
홀수의 최소값:41
홀수의 최대값 위치:3
홀수의 최소값 위치:1
입력된 홀수 목록:[77, 41, 53, 85]
중간값 :65.0
 */
}
