
public class SyncTest {
	private int num=0;
	private int sum=0;
	
	public synchronized void increaseNumber() {
		num++;
		sum=sum+num;
	}
	
	public void increaseNumber2() {
		synchronized (this) {
			num++;
		}
		sum=sum+num;
	}

}
