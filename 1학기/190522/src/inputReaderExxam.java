import java.io.*;
public class inputReaderExxam {

	public static void main(String[] args) {
		Reader reader=new InputStreamReader(System.in);
		try {
			while(true) {
				int i=reader.read();
				if(i==-1) {
					break;
				}
				char c=(char)i;
				System.out.println(c);
			}
		}catch (IOException e) {
			System.err.println(e);
		}
		System.out.println();
	}

}
