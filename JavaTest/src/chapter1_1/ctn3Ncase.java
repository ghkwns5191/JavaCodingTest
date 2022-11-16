package chapter1_1;

public class ctn3Ncase {

	public static void main(String[] args) {
		int N = 100000;
		int ctn = 0;
		
		for(int i = 0; i < N; i++) {
			System.out.println("연산 횟수 : " + ctn++);
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println("연산 횟수 : " + ctn++);
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println("연산 횟수 : " + ctn++);
		}

	}

}
