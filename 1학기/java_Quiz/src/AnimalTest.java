
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a=new Animal("큰뿦소", 3, true);
		String name= a.getName();
		boolean live=a.getLive();
		
		if (live) {
			System.out.println(name + "살아있다.");
		}else {
			System.out.println(name + "죽어있다.");
		}
		
		a.setName("펭귄");
		a.setAge(8);
		
		System.out.println("이름은 "+a.getName()+"이고, 나이는 "+a.getAge()+"살 입니다.");
		
	}

}
