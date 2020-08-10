package object_oriented_type
;


public class NaverMain {

	public static void main(String[] args) {
		System.out.println("객체 생성전");
		Naver nvr1 = new Naver();
		System.out.println("객체 생성후");
		nvr1.User=""; // 없어도됨
		nvr1.ID = "a123";
		nvr1.Password="123a";
		nvr1.PasswordCheck="123a";
		nvr1.name="김1수";
		nvr1.birth="1994/01/01";
		nvr1.gender="남자";
		nvr1.EforID="a123@naver.com";
		nvr1.Phone="010-1111-1111";
		
		Naver nvr2 = new Naver();
		nvr2.User="User2"; 
		nvr2.ID = "b123";
		nvr2.Password="123b";
		nvr2.PasswordCheck="123b";
		nvr2.name="김2수";
		nvr2.birth="1994/02/02";
		nvr2.gender="남자";
		nvr2.EforID="b123@naver.com";
		nvr2.Phone="010-2222-2222";
		
		
		// 매개변수가 있는  생성자를 이용한 객체 생성
		Naver nvr3 = new Naver("User3","c123","123c","123c","김3수","1994/03/03","여자","c123@naver.com","010-3333-3333");
	    System.out.println(nvr3.toString());

	}

}

