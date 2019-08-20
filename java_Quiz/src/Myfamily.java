
public class Myfamily {

	public static void main(String[] args) {
//		Father father=new Father();
//		father.show();
		
//		Me me=new Me();
		GrandFa gr=new GrandFa();
		System.out.println("가보 : "+gr.gabo);
		System.out.println("가보 : "+gr.gahun);
		System.out.println(gr.say());
		System.out.println(gr.eat());
		System.out.println("할아버님의 나이 : "+gr.getNai());
		System.out.println();
		System.out.println("====================================================");
		GrandFa gr1=new GrandFa(99);//생성자 오버로딩
		System.out.println("새할아버님의 나이 : "+gr1.getNai());
		System.out.println("가보 : "+gr1.gabo);
		System.out.println();
		System.out.println("+++++++++++++++++++++++++상속 시작+++++++++++++++++++++++++++");
		Father fa=new Father();
		System.out.println("아버지의 나이 : "+fa.getNai());
		System.out.println("아버지의 집 : "+fa.getHouse());
		System.out.println("가보 : "+fa.gabo);
		System.out.println("가훈 : "+fa.gahun);
		System.out.println(fa.say());
		System.out.println(fa.eat());
		System.out.println("====================================================");
		fa.show();
		System.out.println("====================================================");
		System.out.println();
		System.out.println("+++++++++++++++++++++++++ME+++++++++++++++++++++++++++");
		Me me=new Me();
		
		System.out.println("내집 : "+me.getHouse());
		System.out.println("내 가보 : "+me.gabo);
		System.out.println("가훈 : "+me.gahun);
		System.out.println(me.say());
		System.out.println(me.eat());
		me.biking();
		System.out.println("====================================================");
		
		GrandFa gr2=new Father();//FAther의 것은 못ㅆ므.
		Father fa1=new Me();
		Me me1=(Me)fa1;
	}

}
