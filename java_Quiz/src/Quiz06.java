import java.util.Scanner;

public class Quiz06 {

	static int n;
	static int s[];
	
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("회사 수 입력 : ");
		n=sc.nextInt();
		s=new int [n];
		
		for(i=0;i<n;i++) {
			s[i]=sc.nextInt();
		}
		
		for(i=0;i<s.length;i++) {
			System.out.println(s[i]+" ==> "+rank(s[i])+"등\n");
		}
}//main
	
	public static int rank(int su) {
		int rank=1;
		for(int i=0;i<n;i++) {
			if(su<s[i]) {
				rank++;
			}
		}
		return rank;
	}//rank()

}
