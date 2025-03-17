package Day06.Ex01_추상클래스;

import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 변수
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		
		// 입력받은 도형 배열 (3개)
		Shape[] shapeList = new Shape[3];
		int index = 0;
		
		while (true) {
			if (index == 3)
				break;
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print(">> ");
			String input = sc.next();
			
			if(input.equals("그만"))
				break;
			
			// 도형 선택
			switch (input) {
			// 삼각형
			case "1":
				System.out.print("가로 : ");
				width = sc.nextDouble();
				System.out.print("세로 : ");
				height = sc.nextDouble();
				shapeList[index++] = new Triangle(width, height);
				break;
			// 사각형
			case "2":
				System.out.print("가로 : ");
				width = sc.nextDouble();
				System.out.print("세로 : ");
				height = sc.nextDouble();
				shapeList[index++] = new Rectangle(width, height);
				break;
			// 원형
			case "3":
				System.out.print("반지름 : ");
				radius = sc.nextDouble();
				shapeList[index++] = new Circle(radius);
				break;
			}	// - switch 끝
		}	// - while 끝
		
		// 넓이 총합, 둘레 총합
		double areaSum = 0.0, roundSum = 0.0;
		
		for (Shape shape : shapeList) {
			if(shape == null)
				continue;
			// 넓이와 둘레
			double area = shape.area();
			double round = shape.round();
			
			// 합계
			areaSum += area;
			roundSum += round;
			
			// instanceof : 인스턴스를 확인하는 연산
			if (shape instanceof Triangle) System.out.println("삼각형");
			if (shape instanceof Rectangle) System.out.println("사각형");
			if (shape instanceof Circle) System.out.println("원형");
			
			System.out.println("넓이 : " + area + "\t");
			System.out.println("둘레 : " + round + "\t");
		}	// - foreach 끝
		System.out.println("넓이 총합 : " + areaSum);
		System.out.println("둘레 총합 : " + roundSum);
		
		// - 실수 연산의 한계
		// 실수 연산을 하기 위해서, 컴퓨터가 실수를 2진수로 변환하게 되면, 정수 부분은 문제없이 변환되지만 소수 부분은 2진수 형태의 무한소수 형태로 끝없이 반복된다.
		
		// 십진수 10은 이진수 1010으로 변환된다.
		// - 십진 정수를 이진수로 변환하는 방법 : 10을 2로 나눈 나머지를 나열해서 쓰고, 거꾸로 읽는다.
		// - 십진 소수를 이진수로 변환하는 방법 : 소수 부분을 2로 곱하고, 정수 부분을 나열하여 순서대로 읽는다.
		// 소수로 이진수를 구하는 과정에서 무한 소수가 발생한다.
		// 이러한 원인 때문에 실수 연산의 한계가 발생한다.
		// -> BigDecimal 객체를 이용하여 해결 가능
		
		sc.close();
	}
}
