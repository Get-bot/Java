package object_oriented_type
;


public class NaverMain {

	public static void main(String[] args) {
		System.out.println("��ü ������");
		Naver nvr1 = new Naver();
		System.out.println("��ü ������");
		nvr1.User=""; // �����
		nvr1.ID = "a123";
		nvr1.Password="123a";
		nvr1.PasswordCheck="123a";
		nvr1.name="��1��";
		nvr1.birth="1994/01/01";
		nvr1.gender="����";
		nvr1.EforID="a123@naver.com";
		nvr1.Phone="010-1111-1111";
		
		Naver nvr2 = new Naver();
		nvr2.User="User2"; 
		nvr2.ID = "b123";
		nvr2.Password="123b";
		nvr2.PasswordCheck="123b";
		nvr2.name="��2��";
		nvr2.birth="1994/02/02";
		nvr2.gender="����";
		nvr2.EforID="b123@naver.com";
		nvr2.Phone="010-2222-2222";
		
		
		// �Ű������� �ִ�  �����ڸ� �̿��� ��ü ����
		Naver nvr3 = new Naver("User3","c123","123c","123c","��3��","1994/03/03","����","c123@naver.com","010-3333-3333");
	    System.out.println(nvr3.toString());

	}

}

