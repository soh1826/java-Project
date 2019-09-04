
public class Quiz_03 {

	public static void main(String[] args) {
		int x, y;

		for (x = 1; x <=100; x++) {
			for (y = 1; y<=100; y++) {
				if((x-1 == y+1) && (x+1==2*(y-1))) {
				System.out.println("철수 : "+ x+ " 영희 : "+y);
				}
			}

		}
	}//main

}
