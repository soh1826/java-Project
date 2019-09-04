
public class GrandFa {
	
	private int nai=80;
	public String gabo="상감청자";
	protected String gahun="한대를 맞으면 열대를 돌려줄게.";
	
	public GrandFa() {
		System.out.println("할아버지 생성자");
	}

	public GrandFa(int nai) {
//		this();//생성자를 나타냄.
		this.nai = nai;//객체가 자기 자신을 나타낼때
	}//생성자 오버로딩

	public String say() {
		return "할아버지 말씀 : 어려울수록 즐겨라~~";
	}
	
	public String eat() {
		return "먹고 싶은 걸 먹자.";
	}

	public int getNai() {
		return nai;
	}//정보은닉 : 정당한 권리를 행할 수 있는 거
	
}
