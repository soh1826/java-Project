import java.util.Scanner;

public class word_Quiz {

	public static void main(String[] args) {
		String strArr[]= {"love", "happy", "tired", "java", "handsome"};//배열에 단어를 저장
		Scanner sc=new Scanner(System.in);

		while(true) {
		String answer=getAnswer(strArr);//정답
		String question=getScrambledWord(answer);
		char hint[]=new char[answer.length()];
		for(int i=0;i<hint.length;i++) {
			hint[i]='_';
		}
		
		while(true) {
			System.out.println("Question : "+ question);
			System.out.println("Your Answer is : (q : 종료)");
			String input=sc.nextLine();
		//if(input.equals("q") || input.equals("Q")) {
			if(input.equalsIgnoreCase("q")) {//이걸쓰면 대소문자 구분 없음.
			System.out.println("단어퀴즈를 종료합니다.");
			System.exit(0);
		}else if(input.equalsIgnoreCase(answer)) {
			System.out.println("정답입니다.");
			System.out.println(" ");
			break;
		}else {
			System.out.println(input+"(은)는 정답이 아닙니다. 다시 시도해보세요.");
			System.out.println("Hint : "+getHint(answer, hint));
		}
		}//2while
		}//while
		

	}//main
	
	public static String getAnswer(String strArr[]) {
		int su=(int)(Math.random() *strArr.length);//배열 안 단어를 임의로 하나 정하는 것.
		return strArr[su];//return strArr[(int)(Math.random() *strArr.length)]이것도 가능
	}//getAnswer
	
	public static String getScrambledWord(String str) {
		char[] chArr=str.toCharArray();
		
		
		
		for(int i=0;i<10;i++) {
			int abc= (int)(Math.random() * str.length());
			char temp=chArr[0];
			chArr[0]=chArr[abc];
			chArr[abc]=temp;
		}//for
		return new String(chArr);
	}//1단계
	
	public static String getHint(String answer, char[] hint) {
		int count=0;
		for(int i=0;i<hint.length;i++) {
			if(hint[i]=='_') {
				count++;
			}//_의 갯수를 세는 것.
			if(count>2) {
				while(true) {
					int idx=(int)(Math.random()*hint.length);//idx=0~3 사이의 임의의 숫자 선택
					if(hint[idx]=='_') {
						hint[idx]=answer.charAt(idx);
						break;
					}
				}
			}//for문
		}
		
		return new String(hint);
	}
}
