
public class Quiz_sansu_02 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 10; i < 100; i++) {
			sum=i*(i+2)*(i+4);
			if((sum/100000==4) && (sum%10==2)) {
			System.out.println(i+" * " + (i+2)+" * "+(i+4)+" = " +sum);
			}//if
		}//for
	}//main
}