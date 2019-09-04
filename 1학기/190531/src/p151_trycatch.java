
public class p151_trycatch {

	public static void main(String[] args) {
		String[] irum=new String[3];
		try {
				for(int i=0;i<=irum.length;i++) {
					System.out.println(irum[i]);
				}
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("예외 발생");
				}
	}

}
