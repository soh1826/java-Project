
public class Echo2Exam {

	public static void main(String[] args) {
		inputString is=System.in;
		while(true) {
			int i=is.read();
			if(i==-1)break;
			System.out.print((char)i);
		}
	}

}
