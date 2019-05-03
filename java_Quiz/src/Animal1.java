
public abstract class Animal1 {
	
	abstract public String name();
	
	abstract public String eat();//추상메서드는 로직을 가지고 있지 않는다. 추상 메서드는 오버라이딩 해주어야합니다.
	
	abstract public String action();
	
	/*public String action() {
		
	}이런 아이들을 인스턴스 메서드라고 불리운다. 이 메서드들은 new를 해줘야 만들어지지요. 일반 메서드는 오버라이딩 안해도 됩니다.*/
}
