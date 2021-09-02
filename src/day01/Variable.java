package day01;

public class Variable {
	public static void main(String[] args) {
		
		/*
		 * 1. 변수의 선언방법
		 *  데이터타입 이름 ;
		 * 
		 * int 정수를 저장하는 대표적인 타입
		 * String 은 문자열을 저장하는 대표적인 타입
		 * 
		 */
		
		int num;
		
		// 초기화
		num = 10;
		
		System.out.println(num);
		
		// 변수의 선언과 초기화를 동시에
		// int num = 20;  이름이 고유하여서 위에 쓴 이름은 다시 쓸수없다
		
		int num2 = 20;
		
		num2 = 100; // num2가 100으로 바뀜
		num2 = 200;
		num2 = 300; //  위에서 아래로 읽기 때문에 프린트하면 300이나옴
		
		System.out.println(num2);
		
		
		// 변수는 다른 변수의 값, 또는 연산의 결과도 저장할 수 있습니다.
		int result = num + num2 + 100; // 
		
		System.out.println(result); // 410
		
		System.out.println("--------------------");
		//a는 10을 초기화, b에는 20을 초기화  , result2는 a와 b의 합을 저장한 다음, result2를 1000으로 변경
		
		
		int a;
		int b;
		int result2;
		
		a = 10;
		b = 20;
		result2 = a + b;
		result2 = 1000;
		System.out.println(result2);
		
		System.out.println("---------------------------------------------");
		
		//문자열을 저장
		String name = "박인욱";
		//변수는 타입이 다르면, 바로 저장할 수 없습니다.
//		int str = name;
		
		
	}
	
}
