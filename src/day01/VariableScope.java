package day01;

public class VariableScope {
	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 20;
		int num1 = 10, num2 = 20;
		int num4 = 0;
		
		
		if(true) {
			int num3 = num1 + num2; //30
			num4 = 100;
			System.out.println(num3);
			System.out.println(num4);
			
			
		}
		
// 	System.out.println(num3); // 중괄호 안에서 사용된 변수는 중괄호 밖에서  사용할 수 없음	
	System.out.println(num4);
		
	}
	
}
