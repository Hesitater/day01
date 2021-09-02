package day01;

public class SystemOut {
       
	public static void main(String[] args) {
		// main이라고 적고 ctrl + space를 누르면 main이 바로 생성됩니다.
		/*
		 * 실행단축키 ctrl + f11
		 * sysout 이라고 적고 Ctrl + space를 누르면 출력문이 생성됩니다. 
		 * 
		 * 단축키
		 * 전체 선택 - Ctrl + a
		 * 주석 단축키 - Ctrl + /
		 * 되돌리기 - Ctrl + Z  앞으로 Ctrl + Y
		 * 코드 이동 - 커서를 두고 Alt +방향키로 조절가능  ,
		 * 이름을 한번에 수정 - Alt + Shift + r
		 * 블록 지정 Shitf + 방향키
		 * 
		 * 
		 */

		// 개행을 포함하는 println()
		System.out.println("안뇽하세용!");
		System.out.println();
		System.out.println("반가워용!");
		System.out.println("바로!");
        
		// 개행이 없는 print()
		System.out.print("줄바꿈이 없습니다\n"); 
	
		// 형식 지정 출력문 printf()   구멍을 뚫고싶을떄? "오늘은 서식문자년 8월 10일 입니다
		/*
		 *  \n 줄바꿈
		 *  \t 탭 띄어쓰기
		 *  %d 숫자형식을 입력받는다는 의미
		 *  %s 문자열 형식을 입력 받는다.
		 *  %f 실수 형식을 입력받는다.
		 *  
		 */
		System.out.printf("오늘은 %s년 %d월 %d일 입니다", "돼지", 8, 10);
		
		System.out.printf("%s은 %f입니다\n", "원주율", 3.141592); //원주율은 3.141592 입니다.
		System.out.printf("원주율은 %f 입니다.\n", 3.141592); //원주율은 3.141592 입니다.
		System.out.printf("제 이름은 %s입니다.\n", "고석훈"); // 제이름은 본인이름 입니다.
		
		
	}
	
}
