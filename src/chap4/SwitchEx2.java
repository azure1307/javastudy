package chap4;
/*
 * 컴퓨터에서 임의의 수(난수)를 선택하여 상품 출력하기
 */
public class SwitchEx2 {
	public static void main(String[] args) {
		
		//Math.random(): x
		//0 <= x < 1.0 인 임의의 실수값을 리턴
		//0 <= 10*x < 10.0: 0 ~ 9.9999 
		//0 <= (int)(10*x) < 10: 0 ~ 9 사이의 임의의 정수
		//1 <= (int)(10*x) + 1 < 10: 1 ~ 10 사이의 임의의 정수		
		int num = (int)(Math.random() * 10) + 1; //1~10사이의 임의의 수 저장
		System.out.print(num + ":");
		switch (num) {
		case 1 : System.out.println("자전거 당첨"); break;
		case 2 : System.out.println("USB 당첨"); break;
		case 3 : System.out.println("마우스 당첨"); break;
		default: System.out.println("다음 기회에."); break;
		}
		
	}

}
