
public class Quiz07 {

	public static void main(String[] args) {
		int s, o, t;
		
		for(s=1;s<=9;s++) {
			for(o=0;o<=9;o++) {
				for(t=0;t<=9;t++) {
					if((s*100+o*10+t)-(s*10+o) == (t*10+t)) {
						System.out.printf("%d%d%d - %d%d = %d%d", s, o, t, s, o, t, t);
					}
				}
			}
		}
	}
}
