import java.util.StringTokenizer;

public class program {
public static void main(String[] args) {
	String line;
	String tmpStr="hong 용산구 10.5 20.5";
	StringTokenizer parse = new StringTokenizer(tmpStr);
	String name;
	String add;
	double math;
	double en;
	double total;
	double avg;
	name=parse.nextToken();
	add=parse.nextToken();
	math=Double.valueOf( parse.nextToken()).doubleValue();
	en=Double.valueOf( parse.nextToken()).doubleValue();
	total=math+en;
	avg=total/2.0;
	System.out.println(name+"\t"+add+"\t"+math+"\t"+en+"\t"+total+"\t"+avg);
	String[] arrStr=tmpStr.split(" ");
	for(String str:arrStr) {
		System.out.println("\t");
	}
}
}
