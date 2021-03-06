package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		//int hour = cal.get(Calendar.HOUR);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d년 %d월 %d일 %n", year, month+1, day);
		System.out.printf("%d시 %d분 %d초 %n", hour, minute, second);
	
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		StringBuffer message = new StringBuffer();
		if(dayOfWeek == Calendar.SUNDAY) {
			message.append("일요일");
		}else if (dayOfWeek == Calendar.MONDAY) {
			message.append("월요일");
		}else if (dayOfWeek == Calendar.TUESDAY) {
			message.append("화요일");
		}else if (dayOfWeek == Calendar.WEDNESDAY) {
			message.append("수요일");
		}else if (dayOfWeek == Calendar.THURSDAY) {
			message.append("목요일");
		}else if (dayOfWeek == Calendar.FRIDAY) {
			message.append("금요일");
		}else if (dayOfWeek == Calendar.SATURDAY) {
			message.append("토요일");
		}
		System.out.printf("%d년 %d월 %d일 %s입니다.", year, month+1, day, message.toString());
		
		//ctrl + shift + o
		
		cal.set(1900,0,13);//날짜를 변경하려고 사용하는 메서드
		
		SimpleDateFormat sdf = new SimpleDateFormat("\nyyyy년 MM월 dd일 E요일 HH시mm분ss초");
		Date d = cal.getTime();
		String display = sdf.format(d);
		System.out.println(display);
		//해당월의 마짐가 날짜를 변환
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
	}
}
