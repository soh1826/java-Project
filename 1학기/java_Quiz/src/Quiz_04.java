import java.util.Scanner;

public class Quiz_04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ID 값  3개 입력 : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int key=0;
		int count=0;
		int min;
		
//		for(int i=1;i<=1000;i++) {
//		if(a% i==0 && b%i==0 && c%i==0) {
//			key=i;
//
//		}//if 1
//		}//for 1번째 방법
		
//		for(int i=1;i<=a;i++) {
//			if(a% i==0 && b%i==0 && c%i==0) {
//		key=i;
//	
//	}//if 1
//	}//for 2번째 방법
		
//		// 3번째 방법 : 삼항연상자 
//		min=a < b ? (a< c ? a : c):(b<c ? b : c);
//		System.out.println("최솟값은 "+min);
//		for(int i=1;i<=min;i++) {
//			count++;
//			if(a% i==0 && b%i==0 && c%i==0) {
//		key=i;
//	
//	}//if 1
//	}//for 
		
		//4번째 방법: 
	
		for(int i=1;i<=min(c, min(a, b));i++) {
			count++;
			if(a% i==0 && b%i==0 && c%i==0) {
		key=i;
	
	}//if 1
	}//for 
		
		System.out.println("만능 키 : "+key);
		System.out.println("돌린 횟수 : "+count);
	}//main

	public static int min(int s, int d) {
		if(s>d) {
		return d;
		}else {
			return s;
		}
	}
}
