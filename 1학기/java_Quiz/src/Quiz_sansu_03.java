
public class Quiz_sansu_03 {

	public static void main(String[] args) {
		int h, t;
		int count=0;//갯수
		
		for(int i=1000;i<=9999;i++) {
			h=(i/100)%10;//100의 자리 구하기
			t=(i/10)%10;//10의 자리 구하기
			if((h==t)&&(i%9==0)) {
				count++;
			System.out.print(i+" ");
			if(count%10==0) {
				System.out.println();
			}//카운트 열개가 되면 줄바꿈
			}//if1은 백의 자리와 십의 자리가 같은 것
		}//for
		System.out.println("총 갯수: "+count);
	}//main

}
