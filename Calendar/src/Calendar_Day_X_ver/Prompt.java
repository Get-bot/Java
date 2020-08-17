package Calendar_Day_X_ver;

import java.util.*;

//요일 없는 ver
public class Prompt {
	/**
	 * 
	 * @param week 요일명
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
			System.out.println("년도를 입력하세요(종료시: -1)");
			System.out.print(PROMPT);
			year = sc.nextInt();
			if(year == -1)
				break;
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT1);
			month=sc.nextInt();
			System.out.println("첫째 날의 요일을 입력하세요(SU, MO, TU, WE, TH, FR, SA)");
			System.out.print(PROMPT2);
			String str_weekday=sc.next();
			weekday = parseDay(str_weekday);
			
			if(month>12 || month <1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			cal.printCalender(year, month, weekday);
		}
		System.out.println("Bye~");
		sc.close();
	}
	public static void main(String[] args) {
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}