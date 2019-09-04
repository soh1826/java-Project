import java.util.Scanner;

public class StudentNumberToMajor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("학번 입력 : ");
		String num=sc.next();
		
		if(num.substring(0,1).equals("3")) {
		if (num.substring(1, 2).equals("1")||num.substring(1, 2).equals("2")) {
			System.out.println("인터렉티브 미디어과");
		}else if(num.substring(1, 2).equals("3")||num.substring(1, 2).equals("4")){
			System.out.println("뉴미디어 웹솔루션과");
		}
		else if(num.substring(1, 2).equals("5")||num.substring(1, 2).equals("6")){
			System.out.println("뉴미디어 디자인과");
		}
		}//1
		
		if(num.substring(0,1).equals("2")) {
			if (num.substring(1, 2).equals("1")||num.substring(1, 2).equals("2")) {
				System.out.println("뉴미디어 소프트웨어과");
			}else if(num.substring(1, 2).equals("3")||num.substring(1, 2).equals("4")){
				System.out.println("뉴미디어 웹솔루션과");
			}
			else if(num.substring(1, 2).equals("5")||num.substring(1, 2).equals("6")){
				System.out.println("뉴미디어 디자인과");
			}
			}//1

	}

}
