package Calendar_Day_X_ver;
//요일없는ver
public class CalendarApp {

	private static final int[] MAX_DAYS = {31,29,31,28,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_MAX_DAYS = {31,29,31,28,31,30,31,31,30,31,30,31};
	
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
			else
				return false;
	}
	
	public int getMaxDaysOFMonth(int year,int month) {
		if(isLeapYear(year)) {
		return LEAP_MAX_DAYS[month -1]	;
		}else {
		return MAX_DAYS[month -1];
		}
	}

		public void printCalender(int year,int month) {
		System.out.printf("   <<%d년%d월>>\n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		//get weekday automatically
		int weekday = getWeekday(year, month , 1);
		
		int maxDay = getMaxDaysOFMonth(year,month);
		int count = 7-weekday;
		int delim = (count<7) ? count:0 ;
		/*if (count < 7){
	    delim = count;
		}else {		delim =0;
		}
		*/
		
		//print blank space
		for(int i= 0; i<weekday; i++) {
			System.out.print("   ");
		}
		
		//print first line
		for(int i = 1; i<=count;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
			
		//print from second line to last
		count++;
		for(int i = count ; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == delim)
				System.out.println();
		}
		System.out.println();
		System.out.println();
	}

		private int getWeekday(int year, int month, int day) {
			//기준날짜 요일
			int syear = 1970;
			int smonth = 1;
			int sday = 1;
			int sweekday =3; //1970/01/01=Thursday
			
			int count = 0;
			
			for(int i= syear; i < year; i++ ) {
				int delta = isLeapYear(year) ? 366 : 365;
				count += delta;
			}
			
			
			
			return 0;
		}
}
