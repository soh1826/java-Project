package 수행평가;

import java.util.Scanner;

public class java_수행평가2_2405김소현 {

	public static void main(String[] args) {
		String menus[]= {"가정교사 히트맨 리본", "나츠메 우인장", "문호스트레이 독스", "은혼", "카드캡터사쿠라", "제일복권"};
		String menus1[]= {"핀버튼(5000원)", "포스터(8000원)", "쿠션(15000원)", "파일(7000원)"};
		String gahiriPin[]= {"본고레 핀버튼", "바리아 핀버튼", "캬발로네 핀버튼"};
		String gahiriPoster[]= {"본고레 포스터", "바리아 포스터", "캬발로네 포스터"};
		String gahiriCu[]= {"본고레 쿠션", "바리아 쿠션", "캬발로네 쿠션"};
		String gahiriFile[]= {"본고레 파일", "바리아 파일", "캬발로네 파일"};
		String natumePin[]= {"나츠메 타카시 핀버튼", "야옹 선생 핀버튼"};
		String natumePoster[]= {"나츠메 타카시 포스터", "야옹 선생 포스터"};
		String natumeCu[]= {"나츠메 타카시 쿠션", "야옹 선생 쿠션"};
		String natumeFile[]= {"나츠메 타카시 파일", "야옹 선생 파일"};
		String BungoStrayDogsPin[]= {"다자이 오사무 핀버튼", "나카하라 츄야 핀버튼", "나카지마 아츠시 핀버튼", "아쿠타카와 류노스케 핀버튼"};
		String BungoStrayDogsPoster[]= {"다자이 오사무 포스터", "나카하라 츄야 포스터", "나카지마 아츠시 포스터", "아쿠타카와 류노스케 포스터"};
		String BungoStrayDogsCu[]= {"다자이 오사무 쿠션", "나카하라 츄야 쿠션", "나카지마 아츠시 쿠션", "아쿠타카와 류노스케 쿠션"};
		String BungoStrayDogsFile[]= {"다자이 오사무 파일", "나카하라 츄야 파일", "나카지마 아츠시 파일", "아쿠타카와 류노스케 파일"};
		String GintamaPin[]= {"사카타 긴토키 핀버튼", "타카스기 신스케 핀버튼", "카무이 핀버튼", "오키타 소고 핀버튼"};
		String GintamaPoster[]= {"사카타 긴토키 포스터", "타카스기 신스케 포스터", "카무이 포스터", "오키타 소고 포스터"};
		String GintamaCu[]= {"사카타 긴토키 쿠션", "타카스기 신스케 쿠션", "카무이 쿠션", "오키타 소고 쿠션"};
		String GintamaFile[]= {"사카타 긴토키 파일", "타카스기 신스케 파일", "카무이 파일", "오키타 소고 파일"};
		String CardcaptorSakuraPin[]= {"키노모토 사쿠라 핀버튼", "케로 핀버튼", "유에 핀버튼"};
		String CardcaptorSakuraPoster[]= {"키노모토 사쿠라 포스터", "케로 포스터", "유에 포스터"};
		String CardcaptorSakuraCu[]= {"키노모토 사쿠라 쿠션", "케로 쿠션", "유에 쿠션"};
		String CardcaptorSakuraFile[]= {"키노모토 사쿠라 파일", "케로 파일", "유에 파일"};
		String Cuji[]= {"가정교사 히트맨 리본 ", "문호스트레이 독스"};
		String Cuji1[]= {"Last one : 본고레 대형 쿠션", "A : 사와다 츠나요시&리본 쿠션", "B : 고쿠데라 하야토&야마모토 타케시 쿠션", "C : 히바리 쿄야&로쿠도 무크로 쿠션", "D : 본고레 담요", "E : 바리아 담요", "F : 핀버튼"};
		String Cuji2[]= {"Last one : 데드애플 대형 쿠션", "A : 다자이 오사무&나카하라 츄야 쿠션", "B : 나카지마 아츠시&아쿠타카와 류노스케 쿠션", "C : 무장탐정사 담요", "D : 포트마피아 담요", "E : 암흑시대 담요 ", "F : 핀버튼"};
		int goods=0;
		int price=0;
		int sum=0;
		int su=0;
		String answer, ab;
		int you2;
		
		
	while(true) {//반복할 거에요.
		for (int i=0;i<menus.length;i++) {//첫 메뉴를 보여줍니다.
			System.out.print(i+" : "+menus[i]+"\t");
		}//for문
		
		System.out.print("\n입력 : ");//애니를 입력받습니다.
		Scanner sc=new Scanner(System.in);
		int you=sc.nextInt();
		if(you==5) {//만약 5번인 제일복권을 선택했을 때
			for (int i=0;i<Cuji.length;i++) {
				System.out.print(i+" : "+Cuji[i]+"\t");//제일복권 상품을 보여줍니다.
			}//for문
			System.out.print("\n입력 : ");//제일복권 상품을 입력받고.5
			
			you2=sc.nextInt();
			if(you2==0) {//입력받은 상품이 0일 때
			su=(int)(Math.random() *7)+1;//랜덤을 돌려서 숫자하나 뽑고.
					sum=sum+12000;//제일복권 가격을 넣고.
					System.out.print("제일복권 당첨 상 : "+Cuji1[su]+"\t가격 : "+sum+"원");//랜덤으로 나온 상품을 출력합니다.
			}else if(you2==1) {//입력받은 상품이 1일때
					su=(int)(Math.random() *7)+1;//랜덤을 돌려서 숫자하나뽑고
					sum=sum+12000;//제일복권 가격넣고
					System.out.print("제일복권 당첨 상 : "+Cuji2[su]+"\t가격 : "+sum+"원");//출력합니다.
			}else {
					System.out.println("잘못 입력하셨습니다.");//0 또는 1이 아닐시 무조건 종료합니다.
					System.exit(0);
				}
				 System.out.println("\n총 금액 : "+sum+"원");//총금액 출력해주고
				System.out.println("종료합니다.");//제일복권이니 종료해줍니다.
				System.exit(0);
			}else {//애니를 입력받은 것이 5가 아닌 나머지일때
		for(int i=0;i<menus1.length;i++) {
			System.out.print(i+" : "+menus1[i]+"\t");//다시 메뉴 보여주고
		}//for
		System.out.print("\n입력 : ");//입력받습니다.
		int you1=sc.nextInt();
		
		
	
		switch (you) {
		case 0://가히리를 선택했을 때.
			switch (you1) {
			case 0://가히리를 선택하고 굿즈 중 핀버튼을 선택했을 때.
				for (int i=0;i<gahiriPin.length;i++) {
					System.out.println(i+" : "+gahiriPin[i]+"\t");//핀버튼 종류를 출력합니다.
				}
				System.out.println("\n입력 : ");//핀버튼 입력을 받고
				goods=sc.nextInt();
				sum=5000;//가격을 넣어주고
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+gahiriPin[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 1://가히리를 선택하고 포스터를 선택했을 때
				for (int i=0;i<gahiriPoster.length;i++) {
					System.out.println(i+" : "+gahiriPoster[i]+"\t");//포스터 종류를 출력합니다.
				}
				System.out.println("\n입력 : ");//포스터 입력을 받고
				goods=sc.nextInt();
				sum=8000;
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+gahiriPoster[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 2://가히리를 선택하고 쿠션을 선택했을 때
				for (int i=0;i<gahiriCu.length;i++) {
					System.out.println(i+" : "+gahiriCu[i]+"\t");//쿠션 종류를 출력합니다.
				}
				System.out.println("\n입력 : ");//쿠션을 입력받고
				goods=sc.nextInt();
				sum=15000;//가격을 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+gahiriCu[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 3://가히리를 선택하고 파일을 선택했을 때.
				for (int i=0;i<gahiriFile.length;i++) {
					System.out.println(i+" : "+gahiriFile[i]+"\t");//파일 종류를 출력합니다.
				}
				System.out.println("\n입력 : ");//파일을 출력받고.
				goods=sc.nextInt();
				sum=7000;//가격을 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+gahiriFile[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			default://0~3이 아닌 다른 수를 입력했을 때 무조건 종료시킵니다.
				System.out.println("잘못 입력하셨습니다.");
				System.exit(0);
			}//2switch
			break;
		case 1://나츠메 우인장을 선택했을 때
			switch (you1) {
			case 0://핀버튼
				for (int i=0;i<natumePin.length;i++) {
					System.out.println(i+" : "+natumePin[i]+"\t");
				}
				System.out.print("\n입력 : ");
				goods=sc.nextInt();
				sum=5000;
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+natumePin[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 1: //포스터
				for (int i=0;i<natumePoster.length;i++) {
					System.out.println(i+" : "+natumePoster[i]+"\t");
				}
				System.out.print("\n입력 : ");
				goods=sc.nextInt();
				sum=8000;
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+natumePoster[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 2://쿠션
				for (int i=0;i<natumeCu.length;i++) {
					System.out.println(i+" : "+natumeCu[i]+"\t");
				}
				System.out.print("\n입력 : ");
				goods=sc.nextInt();
				sum=15000;
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+natumeCu[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 3://파일
				for (int i=0;i<natumeFile.length;i++) {
					System.out.println(i+" : "+natumeFile[i]+"\t");
				}
				System.out.print("\n입력 : ");
				goods=sc.nextInt();
				sum=7000;
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+natumeFile[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			default://0~3이 아닌 다른 수를 입력했을 때 무조건 종료시킵니다.
				System.out.println("잘못 입력하셨습니다.");
				System.exit(0);
			}//2switch
			break;
			
		case 2://문호스트레이 독스를 선택했을 때
			switch (you1) {
			case 0://문스독을 선택하고 핀버튼을 선택했을 때
				for (int i=0;i<BungoStrayDogsPin.length;i++) {
					System.out.println(i+" : "+BungoStrayDogsPin[i]+"\t");//핀버튼의 종류를 출력하고
				}
				System.out.print("\n입력 : ");//종류 입력 받고
				goods=sc.nextInt();
				sum=5000;//가격 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+BungoStrayDogsPin[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 1: //문스독을 선택하고 포스터를 선택했을 때
				for (int i=0;i<BungoStrayDogsPoster.length;i++) {
					System.out.println(i+" : "+BungoStrayDogsPoster[i]+"\t");//포스터를 출력하고
				}
				System.out.print("\n입력 : ");//포스터 종류를 입력받고
				goods=sc.nextInt();
				sum=8000;//가격을 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+BungoStrayDogsPoster[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 2://문스독을 선택하고 쿠션을 선택했을 때
				for (int i=0;i<BungoStrayDogsCu.length;i++) {
					System.out.println(i+" : "+BungoStrayDogsCu[i]+"\t");//쿠션의 종류를 출력하고
				}
				System.out.print("\n입력 : ");//종류를 입력받고
				goods=sc.nextInt();
				sum=15000;//가격을 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+BungoStrayDogsCu[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 3://문스독을 선택하고 파일을 선택했을 때
				for (int i=0;i<BungoStrayDogsFile.length;i++) {
					System.out.println(i+" : "+BungoStrayDogsFile[i]+"\t");//파일의 종류를 출력하고
				}
				System.out.print("\n입력 : ");//종류 입력받고
				goods=sc.nextInt();
				sum=7000;//가격 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+BungoStrayDogsFile[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			default://0~3이 아닌 다른 수를 입력했을 때 무조건 종료시킵니다.
				System.out.println("잘못 입력하셨습니다.");
				System.exit(0);
			}//2switch
			break;
			
		case 3://은혼을 선택했을 때
			switch (you1) {
			case 0://은혼을 선택하고 핀버튼을 선택했을 때
				for (int i=0;i<GintamaPin.length;i++) {
					System.out.println(i+" : "+GintamaPin[i]+"\t");//핀버튼 종류 보여주고
				}
				System.out.print("\n입력 : ");//종류 입력받고
				goods=sc.nextInt();
				sum=5000;//가격을 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+GintamaPin[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 1: //은혼을 선택하고 포스터를 선택했을 때
				for (int i=0;i<GintamaPoster.length;i++) {
					System.out.println(i+" : "+GintamaPoster[i]+"\t");//포스터의 종류를 출력하고
				}
				System.out.print("\n입력 : ");//종률르 입력받고
				goods=sc.nextInt();
				sum=8000;//가격을 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+GintamaPoster[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 2://은혼을 선택하고 쿠션을 선택했을 때
				for (int i=0;i<GintamaCu.length;i++) {
					System.out.println(i+" : "+GintamaCu[i]+"\t");//쿠션의 종류를 출력하고
				}
				System.out.print("\n입력 : ");//종류 입력받고
				goods=sc.nextInt();
				sum=15000;//가격을 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+GintamaCu[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 3://은혼을 선택하고 파일을 선택했을 때
				for (int i=0;i<GintamaFile.length;i++) {
					System.out.println(i+" : "+GintamaFile[i]+"\t");//파일의 종류를 보여주고
				}
				System.out.print("\n입력 : ");//종류를 입력받고
				goods=sc.nextInt();
				sum=7000;//가격을 넣어준다음
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+GintamaFile[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			default://0~3이 아닌 다른 수를 입력했을 때 무조건 종료시킵니다.
				System.out.println("잘못 입력하셨습니다.");
				System.exit(0);
			}//2switch
			break;
			
		case 4://카드캡터사쿠라을 선택했을 때
			switch (you1) {
			case 0://카캡사를 선택 후 핀버튼을 선택했을 시
				for (int i=0;i<CardcaptorSakuraPin.length;i++) {
					System.out.println(i+" : "+CardcaptorSakuraPin[i]+"\t");//핀버튼 종류 출력하고
				}
				System.out.print("\n입력 : ");///종류를 입력받고
				goods=sc.nextInt();
				sum=5000;//가격을 넣어요.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+CardcaptorSakuraPin[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 1: //카캡사를 선택 후 포스터를 선택했을 시
				for (int i=0;i<CardcaptorSakuraPoster.length;i++) {
					System.out.println(i+" : "+CardcaptorSakuraPoster[i]+"\t");//포스터 종류를 보여주고
				}
				System.out.print("\n입력 : ");//종류 입력받고
				goods=sc.nextInt();
				sum=8000;//가격을 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+CardcaptorSakuraPoster[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 2://카캡사를 선택한 후 쿠션을 선택했을 떄
				for (int i=0;i<CardcaptorSakuraCu.length;i++) {
					System.out.println(i+" : "+CardcaptorSakuraCu[i]+"\t");//쿠션의 종류를 출력하고
				}
				System.out.print("\n입력 : ");//종류 입력받고
				goods=sc.nextInt();
				sum=15000;//가격을 넣어요.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+CardcaptorSakuraCu[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			case 3://카캡사 선택 후 파일을 선택했을 시
				for (int i=0;i<CardcaptorSakuraFile.length;i++) {
					System.out.println(i+" : "+CardcaptorSakuraFile[i]+"\t");//파일의 종류를 보여주고
				}
				System.out.print("\n입력 : ");//그 종류 입력받고
				goods=sc.nextInt();
				sum=7000;//가격을 넣어줍니다.
				System.out.println("애니 : "+menus[you]+"\t종류 : "+menus1[you1]+"\t굿즈 : "+CardcaptorSakuraFile[goods]+"\t가격 : "+sum+"원");//어떤 애니의 무슨 종류의 굿즈를 샀는지 보여줍니다.
				break;
			default://0~3이 아닌 다른 수를 입력했을 때 무조건 종료시킵니다.
				System.out.println("잘못 입력하셨습니다.");
				System.exit(0);
			}//2switch
			break;
		default:
			break;
		}//switch
		}
		
		
		System.out.print("추가 주문 하시겠습니까?(y/n) : ");//예의상 추가주문 물어봐주고.
		answer=sc.next();
	
		if(answer.equalsIgnoreCase("n")) {//n이나 N을 입력했을 시 종료시켜줍니다.
			System.out.println("종료합니다.");
			System.exit(0);
		}//if
		
	}//while
}
}