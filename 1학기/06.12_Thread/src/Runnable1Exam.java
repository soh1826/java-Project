class Top implements Runnable{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(i+" \t");
		}
	}
}
public class Runnable1Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top t=new Top();
		Thread thd=new Thread(t);
		thd.start();
		System.out.println("프로그램 종료");
	}

}
