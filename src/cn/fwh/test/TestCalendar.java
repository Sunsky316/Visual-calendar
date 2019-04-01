package cn.fwh.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {

		// ������ڵ����Ԫ��
		Calendar calendar = new GregorianCalendar(2019, 2, 28, 20, 32, 50);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);// Ҳ����ʹ��DAY_OF_MONTH
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);// ���ڼ���1-7��1���գ�2��һ
/*
		System.out.println(year);
		System.out.println(month);// 0-11��ʾ��Ӧ���·ݣ�0��1��
		System.out.println(weekday);
		System.out.println(day);
*/
		// �������ڵ����Ԫ��
		Calendar c2 = new GregorianCalendar();
		c2.set(Calendar.YEAR, 8012);

		//System.out.println(c2);// ʲô��������Ĭ�ϵ�ǰ����

		// ���ڵļ���
		Calendar c3 = new GregorianCalendar();
		c3.add(Calendar.DATE, 100);// ����100��
		//System.out.println(c3);

		// ���ڶ����ʱ������ת��
		Date d4 = c3.getTime();
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date());

		
		Calendar c5 = new GregorianCalendar();
		printCalendar(c5);
	}

	
	
	
	public static void printCalendar(Calendar c) {
		// ��ӡ��1918��10��10�� 11:23:45
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);// Ҳ����ʹ��DAY_OF_MONTH
		int weekday = c.get(Calendar.DAY_OF_WEEK) - 1;// ���ڼ���1-7��1���գ�2��һ
		String weekday2 = weekday == 0 ? "��" : weekday + "";
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.println(year + "��" + month + "��" + day + "��" + " " + hour + "��" + minute + "��" + second + "��" + " ����"
				+ weekday2);

	}

}
