import java.util.Scanner;

public class PassWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("시저의 암호문 입력 : ");
		String pw1=sc.nextLine(); //line을 쓰면 한줄을 통째로 읽어드려 공백도 읽음
		char str[]=pw1.toCharArray();
		char temp;
		
		for(int i=0;i<str.length;i++) {
			if(str[i]==' ') {
				temp=' ';
			}else if(str[i]=='a') {
				temp='x';
			}else if(str[i]=='b') {
				temp='y';
			}else if(str[i]=='c') {
				temp='z';
			}else {
				temp=(char)(str[i]-3);
			}
			System.out.print(temp);
		}//for
		
	}//main
}
