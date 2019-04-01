package cn.fwh.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {

		// 获得日期的相关元素
		Calendar calendar = new GregorianCalendar(2019, 2, 28, 20, 32, 50);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);// 也可以使用DAY_OF_MONTH
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);// 星期几。1-7，1是日，2是一
/*
		System.out.println(year);
		System.out.println(month);// 0-11表示对应的月份，0是1月
		System.out.println(weekday);
		System.out.println(day);
*/
		// 设置日期的相关元素
		Calendar c2 = new GregorianCalendar();
		c2.set(Calendar.YEAR, 8012);

		//System.out.println(c2);// 什么都不传就默认当前日期

		// 日期的计算
		Calendar c3 = new GregorianCalendar();
		c3.add(Calendar.DATE, 100);// 往后100天
		//System.out.println(c3);

		// 日期对象和时间对象的转化
		Date d4 = c3.getTime();
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date());

		
		Calendar c5 = new GregorianCalendar();
		printCalendar(c5);
	}

	
	
	
	public static void printCalendar(Calendar c) {
		// 打印：1918年10月10日 11:23:45
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);// 也可以使用DAY_OF_MONTH
		int weekday = c.get(Calendar.DAY_OF_WEEK) - 1;// 星期几。1-7，1是日，2是一
		String weekday2 = weekday == 0 ? "日" : weekday + "";
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.println(year + "年" + month + "月" + day + "日" + " " + hour + "点" + minute + "分" + second + "秒" + " 星期"
				+ weekday2);

	}

}
