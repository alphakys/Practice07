package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

	//	Shape s = new Shape("빨강"); // abstract 클래스는 인스턴스 생성 불가 그래서 지웠습니다.
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		//sr1을 그리는 메소드 호출
		
		Ractangle sr2 = (Ractangle)sr1;
		
		sr2.draw();
		
	
		
		
		//sr1의 가로크기 출력
		
		
		System.out.println(sr2.getWidth());
		
		
		
		
		
	}
}

	
	