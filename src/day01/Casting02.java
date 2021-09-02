package day01;

public class Casting02 {
	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환할 때는 (type)캐스팅을 이용하여
		 * 명시적으로 변환해야합니다
		 */
		
		int i = 65;
		char c = (char)i;
		short s = (short)i;
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(s);
		
		System.out.println("------------------");
		
		double d = 3.14;
		int k = (int)d;
		
		System.out.println(d);
		System.out.println(k);
		
		System.out.println("------------------");
		// 강제타입변환시 주의할점은 해당값을 받을 수 없는 범위가 들어오면 잘려나간 값이 저장됩니다.
		int a = 1000;
		byte b = (byte)a;
		
		System.out.println(a);
		System.out.println(b); // 계산기에서 확인  이진법 
		
		//예외인 경우
		// char, short는 예외적으로 명시적 형변환을 해야합니다. () 캐스팅 해야됨
		// 부호없는 비트,
		System.out.println("------------------");
		
		char cc = 'A';
		short ss = (short)cc;
		
		System.out.println(cc);
		System.out.println(ss);
		
		
		
	}
}
