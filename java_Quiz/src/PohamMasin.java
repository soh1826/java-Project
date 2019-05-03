
public class PohamMasin {

	public static void main(String[] args) {
		PohamCar lee=new PohamCar("이승엽", "검정색");
		lee.turnHandle(120);
	}
	System.out.println(lee.ownerName+"의 차량 색깔은 "+lee.carColor+"이고, "+ lee.handle.quantity+"킬로 속도로 "+ lee.turnShow+" 중입니다.");

}
