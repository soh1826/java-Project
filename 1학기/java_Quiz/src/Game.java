import java.util.Scanner;

public class Game {
	
	 public static final int 가위=1;
	 public static final int 바위=2;
	 public static final int 보=3;
	

	public static void main(String[] args) {
		int com, you;
		Scanner sc=new Scanner(System.in);
		String choice;
		
		while(true) {
			com=(int)(Math.random()*3)+1;
			
			System.out.print("원하는 값을 입력 (1: 가위  2:바위  3:보) : ");
			you=sc.nextInt();
			System.out.print("com : "+com+"you : "+you);
			
			//방법 1 :  초급자 코스
			
//			if(com==1) {	//컴ㅁ퓨터  : 가위
//				switch (you) {
//				case 1:
//						System.err.println("컴퓨터 : 가위, 사용자 : 가위 ==> 비겼습니다.");
//					break;
//				case 2:
//					System.err.println("컴퓨터 : 가위, 사용자 : 바위 ==> 사용자가 이겼습니다.");
//				break;
//				case 3:
//					System.err.println("컴퓨터 : 가위, 사용자 : 보 ==> 컴퓨터가 이겼습니다..");
//				break;
//
//				default:
//					System.err.println("1~3 사이의 정수만 입력해주세요.");
//					break;
//				}
//			}else if(com==2) {	//컴퓨터 : 바위
//				switch (you) {
//				case 1:
//						System.err.println("컴퓨터 : 바위, 사용자 : 가위 ==> 컴퓨터가 이겼습니다.");
//					break;
//				case 2:
//					System.err.println("컴퓨터 : 바위, 사용자 : 바위 ==> 비겼습니다.");
//				break;
//				case 3:
//					System.err.println("컴퓨터 : 바위, 사용자 : 보 ==> 사용자가 이걌습니다.");
//				break;
//
//				default:
//					System.err.println("1~3 사이의 정수만 입력해주세요.");
//					break;
//				}
//			}else if(com==3) {	//컴퓨터 : 보
//				switch (you) {
//				case 1:
//						System.err.println("컴퓨터 : 보, 사용자 : 가위 ==> 사용자가 이겼습니다.");
//					break;
//				case 2:
//					System.err.println("컴퓨터 : 보, 사용자 : 바위 ==> 컴퓨터가 이겼습니다.");
//				break;
//				case 3:
//					System.err.println("컴퓨터 : 보, 사용자 : 보 ==> 비겼습니다.");
//				break;
//
//				default:
//					System.err.println("1~3 사이의 정수만 입력해주세요.");
//					break;
//				}
//			}//유지보수를 생각을 안했네요. 삐빅 생각을 하고 만듭시다.
			
			
			
			
			//중급자 코스
//			switch (com) {
//			case 1:
//				System.out.print("컴퓨터 : 가위\t");
//				break;
//			case 2:
//				System.out.print("컴퓨터 : 바위\t");
//				break;
//			case 3:
//				System.out.print("컴퓨터 : 보\t");
//				break;
//			}//switch
//			
//			switch (you) {
//			case 1:
//				System.out.print("사용자 : 가위\t");
//				break;
//			case 2:
//				System.out.print("사용자 : 바위\t");
//				break;
//			case 3:
//				System.out.print("사용자 : 보\t");
//				break;
//			default :
//				System.out.println("1~3 사이의 숫자만 입력해주세요.");
//			}//switch
			
			//상급자 코스
			
			
			
			System.out.println("컴퓨터 : "+print(com));
			System.out.println("사용자 : "+print(you));
			
			
			
			
//			if((you==가위 && com==보) || (you==바위 && com==가위) || (you==보 && com==바위)) {
//				System.out.println("사용자의 승리");
//			}else if(you==com) {
//				System.out.println("비겼습니다.");
//			}else {
//				System.out.println("컴퓨터의 승리.");
//			}

			
			//상급자
			
//			switch (you-com) {
//			case 1: case 4:
//				System.out.println("사용자의 승리");
//				break;
//			case 2: case 5:
//				System.out.println("텀퓨터의 승리");
//				break;
//			case 3:
//				System.out.println("비겼습니다.");
//				break;
//			default:
//				System.out.println("1~3 사이의 숫자만 입력해주세요.");
//				break;
//			}
			
			//최상급자
			switch ((you-com+3)%3) {
			case 1:
				System.out.println("사용자의 승리");
				break;
			case 2:
				System.out.println("텀퓨터의 승리");
				break;
			case 0:
				System.out.println("비겼습니다.");
				break;
			default:
				System.out.println("1~3 사이의 숫자만 입력해주세요.");
				break;
			}
			
			System.err.print("계속하시겠습니까? ( y or n ) :");
			choice=sc.next();
//			if(choice.equals("n") || choice.equals("N")) {
			if(choice.equalsIgnoreCase("n")) { 				//대소문자를 구분하지 않겠다. n을 눌러도 종료, N을 눌러도 종료
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}//while

	}
}


//static public  String print(int su) {
//	
//}
