
public class Lotto {

	public static void main(String[] args) {
		
		int[] lotto=new int[7];
		int[] human=new int[6];
		int lucky;
		int lucky_b;
		int rank1=0, rank2=0, rank3=0, rank4=0, rank5=0, rank6=0;
		int counnt=1000;
		
		for (int i=0;i<7;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}//for
		}//for
		
		
		for (int k=1;k<counnt;k++) {
			System.out.printf("[제 %5d 회]", k);
			for(int i=0;i<6;i++) {
				System.out.printf("%2d", lotto[i]);
			}
			
			System.out.printf("[%2d] \t", lotto[6]);
			
			for (int i=0;i<6;i++) {
				human[i]=(int)(Math.random()*45)+1;
				
				for(int j=0;j<i;j++) {
					if(human[i]==human[j]) {
						i--;
						break;
					}
				}//for
			}//for
			
			lucky =0;
			
			for (int i=0;i<6;i++) {
				for(int j=0;j<6;j++) {
					if(human[i]==lotto[j]) {
						System.out.printf("%2d", human[i]);
						lucky++;
						break;
					}else if(human[i]==lotto[j] && j==5) {
						System.out.printf("%2d", human[i]);
					}
				}//for 2
			}//for1
			int i1;
			
			for(i1=0, lucky_b=0;i1<6;i1++) {
				if(lotto[6]==human[i1]) {
					lucky_b=1;
					break;
				}
			}
			
			switch(lucky) {
			case 6:
				System.out.println("===== 축하합니다. 1등입니다. =====");
				rank1++;
				break;
			case 5:
				if(lucky_b==1) {
				System.out.println("[2등]");
				rank2++;
				break;
				}else {
					System.out.println("[3등]");
					rank3++;
				}
			case 4:
				System.out.println("[4등]");
				rank4++;
				break;
			case 3:
				System.out.println("[5등]");
				rank5++;
				break;
			default:
				System.out.println("꽝");
				rank6++;
				break;
			}
			
		}//for k
		
		System.out.println();
		System.out.println("[총 도전 횟수] : "+counnt+"회\n");
		System.out.println("1등 : "+rank1+"회");
		System.out.println("2등 : "+rank2+"회");
		System.out.println("3등 : "+rank3+"회");
		System.out.println("4등 : "+rank4+"회");
		System.out.println("5등 : "+rank5+"회");
		System.out.println("6등 : "+rank6+"회");
		
	}//main

}
