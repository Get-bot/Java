package Calendar_Day_X_ver;

import java.util.*;

//���� ���� ver
public class Prompt {
	/**
	 * 
	 * @param week ���ϸ�
	 * @return 0~6(0 = Sunday, 6= Saturday)
	 */
	public int parseDay(String week) {
		if(week.equals("SU")&& week.equals("su"))return 0;
		else if(week.equals("MO") || week.equals("mo")) return 1;
		else if(week.equals("TU") || week.equals("tu")) return 2;
		else if(week.equals("WE") || week.equals("we")) return 3;
		else if(week.equals("TH") || week.equals("th")) return 4;
		else if(week.equals("FR") || week.equals("fr")) return 5;
		else if(week.equals("SA") || week.equals("sa")) return 6;
		else
			return 0;
	}
	
	private final static String PROMPT = "year> ";
	private final static String PROMPT1 = "month> ";
	private final static String PROMPT2 = "WEEKDAY> ";
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		CalendarApp cal = new CalendarApp();
		
		int month = 1;
		int year = 2020;
		int weekday = 0;
		
		while (true) {
			System.out.println("�⵵�� �Է��ϼ���(�����: -1)");
			System.out.print(PROMPT);
			year = sc.nextInt();
			if(year == -1)
				break;
			System.out.println("���� �Է��ϼ���");
			System.out.print(PROMPT1);
			month=sc.nextInt();
			System.out.println("ù° ���� ������ �Է��ϼ���(SU, MO, TU, WE, TH, FR, SA)");
			System.out.print(PROMPT2);
			String str_weekday=sc.next();
			weekday = parseDay(str_weekday);
			
			if(month>12 || month <1) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			cal.printCalender(year, month, weekday);
		}
		System.out.println("Bye~");
		sc.close();
	}
	public static void main(String[] args) {
		//�� ����
		Prompt p = new Prompt();
		p.runPrompt();
	}
}