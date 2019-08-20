import java.io.BufferedReader;
import java.io.FileReader;

public class 성적처리 {

	public static void main(String[] args) {
		
		FileReader fr;
		try{
			fr= new FileReader("src/writed.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String line;
		while((String line=br.readLine())!= null) {fss
			성적 new성적=new 성적();
			new성적.setName(st.nextToken());
			new성적.setAddreas(st.nextToken());
			new성적.setMath(st.nextToken());
			new성적.setEnglish(st.nextToken());
		}
	}
	}
	}
