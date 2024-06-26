package test0328;
/*
1. Food 클래스
멤버 변수 : 가격(price)과 포인트(point)
생성자 : 식품의 객체 생성시 가격을 입력받아야 하고, 가격의 10%를 포인트로 저장한다.
식품의 종류는 과일(Fruit),음료(Drink),과자(Snack)로 나눠 진다.
Fruit 클래스 : Food 클래스의 하위 클래스
Drink 클래스 : Food 클래스의 하위 클래스
Snack 클래스 : Food 클래스의 하위 클래스
과일 클래스는 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram)을 멤버로 가진다
과일의 종류로는 사과(Apple),복숭아(Peach),
음료의 종류로는 콜라(Cock) 와 사이다(Sidar)
과자의 종류로는 비스킷(Biscuit)과 쿠키(Cookie) 가 있다.
사과,복숭아, 콜라, 사이다,비스킷,쿠키 클래스에 toString() 메서드를 구현하고
각각의 이름을 리턴한다.
 */
class Food {
	int price, point;
	Food(int price) {
		this.price = price;
		//this.point = price/10; 해도된다
		this.point = (int)(price*0.1);
	}
}

//과일, 사과, 복숭아
class Fruit extends Food {
	double brix;
	//여기서 price랑 brix 다 해두면 얘를 상속한 애에선 super만 쓰면 되네..
	Fruit(int price) {
		super(price);
	}
}

class Apple extends Fruit {
	Apple(int price, double brix) {
		super(price);
		this.brix = brix;
	}
	public String toString() {
		return "사과 가격:"+price+", 당도:"+brix+", 적립된 포인트:"+point;
	}
}

class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price);
		this.brix = brix;
	}
	public String toString() {
		return "복숭아 가격:"+price+", 당도:"+brix+", 적립된 포인트:"+point;
	}
}

//음료, 콜라, 사이다
class Drink extends Food {
	int ml;
	Drink(int price) {
		super(price);
	}
}

class Cock extends Drink {
	Cock(int price, int ml) {
		super(price);
		this.ml = ml;
	}
	public String toString() {
		return "콜라 가격:"+price+", 용량:"+ml+", 적립된 포인트:"+point;
	}
	
}

class Sidar extends Drink {
	Sidar(int price, int ml) {
		super(price);
		this.ml = ml;
	}
	public String toString() {
		return "사이다 가격:"+price+", 용량:"+ml+", 적립된 포인트:"+point;
	}
}

//과자, 비스킷, 쿠키
class Snack extends Food {
	int gram;
	Snack(int price) {
		super(price);
	}
}

class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price);
		this.gram = gram;
	}
	public String toString() {
		return "비스킷 가격:"+price+", 무게:"+gram+", 적립된 포인트:"+point;
	}
}

class Cookie extends Snack {
	Cookie(int price, int gram) {
		super(price);
		this.gram = gram;
	}
	public String toString() {
		return "쿠키 가격:"+price+", 무게:"+gram+", 적립된 포인트:"+point;
	}
}

public class Test2 {
	public static void main(String[] args) {
		Apple apple = new Apple(1000,10.5);//가격, 당도(brix)
		Peach peach = new Peach(2000,13.5);//가격, 당도(brix)
		System.out.println("사과 가격:" + apple.price);
		System.out.println("사과 당도:" + apple.brix);
		System.out.println("=====================")
		;		
		System.out.println(apple);
		System.out.println(peach);
		System.out.println();
		
		Cock cock = new Cock(500,500);   //가격, 용량(ml)
		Sidar sidar = new Sidar(1500,1000);//가격, 용량(ml)
		System.out.println(cock);
		System.out.println(sidar);
		System.out.println();
		
		Biscuit bis = new Biscuit(10000,500);//가격, 무게(gram)
		Cookie cookie = new Cookie(500,5000);//가격, 무게(gram)
		System.out.println(bis);
		System.out.println(cookie);

	}
}
