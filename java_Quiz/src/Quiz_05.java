import java.util.Scanner;

public class Quiz_05 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		String c;
		

		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.println("가위바위보 게임 1)가위   2)바위   3)보");
			System.out.print("입력 : ");
			b=sc.nextInt();
			a=(int)(Math.random()*3)+1;	
			switch (a) {
			case 1:
				if(b==1) {
					System.out.println("컴퓨터도 가위, 당신도 가위\n 비겼습니다.");
				}else if(b==2) {
					System.out.println("컴퓨터는 가위, 당신은 바위\n 당신이 이겼습니다.");
				}else if(b==3) {
					System.out.println("컴퓨터는 가위, 당신은 보\n 컴퓨터가 이겼습니다.");
				}break;
			case 2:
				if(b==2) {
					System.out.println("컴퓨터도 바위, 당신도 바위\n 비겼습니다.");
				}else if(b==3) {
					System.out.println("컴퓨터는 바위, 당신은 보\n 당신이 이겼습니다.");
				}else if(b==1) {
					System.out.println("컴퓨터는 바위, 당신은 가위\n 컴퓨터가 이겼습니다.");
				}break;
			case 3:
				if(b==3) {
					System.out.println("컴퓨터도 보, 당신도 보\n 비겼습니다.");
				}else if(b==1) {
					System.out.println("컴퓨터는 보, 당신은 가위\n 당신이 이겼습니다.");
				}else if(b==2) {
					System.out.println("컴퓨터는 보, 당신은 바위\n 컴퓨터가 이겼습니다.");
				}break;
			default:
				break;
			}
			
			System.out.print("다시 하시겠습니까? (y/n)\n 입력 : ");
			c=sc.next();
			if((c.equals("n")) || (c.equals("N"))) {
				System.exit(0);
			}
			
		}
		
	}

}
