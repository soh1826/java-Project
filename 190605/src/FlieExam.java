import java.awt.geom.FlatteningPathIterator;
import java.io.*;
public class FlieExam {

	public static void main(String[] args) {
		try {
			FlieReader flie=new FlieReader("test.java");

		} catch (FlatteningPathIterator e) {
			e.printStackTrace();
		}
		
	}

}
