package day01;

public class Casting01 {
	public static void main(String[] args) {
		
		
		/*
		 * 크기가 작은 타입을 큰 타입에 대입할 때는
		 * 자바 가상 머신 JVM이 자동으로 형변환을 진행합니다.
		 */
		
		
		byte b = 10;
		
		short s = b; // byte -> short 자동형변환
		int i = b;   // byte -> int 자동형변환
		long ㅣ = b;  // byte -> long 자동형변환
		
		
		System.out.println(s);
		
		char c = '가';  
		int a = c; // char -> int형으로 자동형변환 되어 a가 44032 가 나옴
		             // 결과가 궁금할때는 타입을 보아라
		
		System.out.println("가의 유니코드 숫자값:" + a);
		
		int k = 1000;
		double d = k; //int -> double형으로 자동형변환
		
		System.out.println(d);  // 한줄삭제 ctrl + d
		
		
	}
	
	
}
