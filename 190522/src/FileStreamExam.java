import java.io.*;
public class FileStreamExam {

	public static void main(String[] args) throws IOException{
		byte[] b=new byte[1024];
		FileInputStream fis;
		FileOutputStream fos;
		try {
		fis=new FileInputStream("fin.txt");
		fos=new FileOutputStream("toul.txt");
		fis.read(b);
		fos.write(b);
		fis.close();
		fos.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
