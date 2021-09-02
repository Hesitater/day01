package day01;

public class DataType {

	public static void main(String[] args) {

		byte a = 127; // -128<=byte<= 127 [-128,127]
		byte a1 = -128;

		short b = 32767; // -32768<= short <= 32767 [
		short b1 = -32768;

		int c = 2147483647; // 기본형
		int c1 = -2147483648;

		long d = 2147483648L; // L을 붙임
		System.out.println(d);

		/*
		 * 2진수값으로 저장할 때 0b를 붙여 저장
		 * 8진수값으로 저장할 때 0을 붙여 저장
		 * 16진수값으로 저장할 때 0x를 붙임
		 * 
		 * 
		 */
		
		
		 int bin = 0b1010;
		 System.out.println("2진수 1010의 값:" + bin + "입니다.");
		 
		 System.out.println("-------------------------------");
		 
		 //실수형  float double
		 
		 float f1 = 3.14F; //F를 붙임(f대소문자 상관없음)  - 7자리까지 유효
		 double d1 = 3.14; // 15자리까지 유효
		 
		 System.out.println(f1);		
		 System.out.println(d1);
		 
		 
		 //e 표기법
		 float f2 = 3.14159265e-2F; //10의 -2 
		 double d2 = 3.14159265e3; // 10의^3승
		 System.out.println(f2);
		 System.out.println(d2);
		 
		 
		 // 논리형 boolean 참,거짓 (1바이트)
		 boolean bool1 = true;
		 boolean boo12 = false;
		 System.out.println(bool1);
		 System.out.println(boo12);
		 
		 
	}
}
