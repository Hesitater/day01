package day01;

public class Casting03 {
	public static void main(String[] args) {
	
		//연산에서 형변환
		char c = 'A';
		int i = 2;
		
		
		//1.서로 다른 타입의 연산에서 두 데이터 중 큰 타입을 가진 쪽 맞추어 자동 형변환 된 후 연산 진행
		// 최종 결과가 큰 타입에 맞추어 진행됩니다.
		
		char cc = (char)(c + i);
		System.out.println(cc);
		
		int j = 10;
		double d = 3.14;
		
		System.out.println(j + d);

		//2. int형보다 작은 타입의 연산의 결과는 무조건 int 이다.
		//   int형보다 작은 데이터 타입의 연산으 ㄹ진행할 경우는 최종결과로 int형으로 반환합니다
		
		byte b1 = 100;
		byte b2 = 12;
		byte b3 = (byte)(b1 + b2);
		
		short s1 = 100;
		byte s2 = 13;
		int s3 = s1 + s2;  // int
		
		System.out.println(b3);
		System.out.println(s3);
		
		
		
//		char x = 'A';
//		char y = 'B';
//		
//		System.out.println(x + y);
//		
//		byte l = 10;
//		char m = 'A';
//		
//		System.out.println(l + m);

		
	}
	
}
