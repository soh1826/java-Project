package kr.hs.emirim.practice;

public class CasPractice {

	public static void main(String[] args) {
		연예인 박나래 =new 연예인();
		박나래.실명="박나래";
		박나래.여자인가=true;
		박나래.방송하기();
		박나래.인터뷰하기();
		
		영화배우 우스이=new 영화배우();
		우스이.실명="우스히 마사히로";
		우스이.여자인가=false;
		우스이.방송하기();
		우스이.인터뷰하기();
		우스이.대표영화= "신이 말하는대로";
		
		가수 아이 = new 가수();
		아이.실명="미카제 아이";
		아이.여자인가=false;
		아이.대표곡="";
		아이.공연하기();
		아이.개인기하기();
	}

}
