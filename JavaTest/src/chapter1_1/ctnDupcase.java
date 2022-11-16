package chapter1_1;

public class ctnDupcase {

	public static void main(String[] args) {
		int N = 100000;
		int ctn = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.println("연산 횟수 : " + ctn++);
			}
		}

	}

}
