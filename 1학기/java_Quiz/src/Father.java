
public class Father extends GrandFa{
	
	private int nai=55;
	private int house=1;
	public String gabo="송골매";
	
	public Father() {
		super();
		System.out.println("아버지 생성자");
	}

	public Father(int nai) {
		this();
		this.nai = nai;
	}

	public int getNai() {
		return nai;
	}

	public int getHouse() {
		return house;
	}
	
	public String say() {
		return "아버지 말씀 : 인생을 즐겨라.";
	}
	
	public void show() {
		System.out.println(gabo);
		System.out.println(super.gabo);
		System.out.println("아버지 나이 : "+getNai());
		System.out.println("할아버지 나이 : "+super.getNai());
		System.out.println(say());
		System.out.println(super.say());
		
		
		//this.gabo라고 써도 됨. 안 붙여도 상관 없는게, 우선순위는 자식이 높음. super.gabo하면 할아버지 가보 출력
	}
}


