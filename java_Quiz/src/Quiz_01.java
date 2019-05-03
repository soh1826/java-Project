import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("철근의 총 길이:");
		int n=sc.nextInt();
		System.out.print("자를 길이: ");
		
		
		int k=sc.nextInt();
		int cnt=n/k; //철근 갯수
		
		if (cnt>9999) {
			System.out.println("번호초과 오류");
			System.exit(0);
		}else {
			for (int i = 1; i <=cnt; i++) {
				System.out.printf("F-%04d\n", i);
			}
		}

		
	}

}
