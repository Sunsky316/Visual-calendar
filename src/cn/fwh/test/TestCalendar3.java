package cn.fwh.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序（版本二）
 * 
 * @author Administrator
 *
 */

public class TestCalendar3 {
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入日期：（格式：2019-02-28）");
		Scanner scanner = new Scanner(System.in);//键盘输入
		String str = scanner.nextLine();
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");//日期格式
		Date date = df.parse(str);// 字符串变成时间
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		int day = c.get(Calendar.DATE);
		int days = c.getActualMaximum(Calendar.DATE);

		
		//表格第一行放周几
		System.out.println("日\t一\t二\t三\t四\t五\t六");

		c.set(Calendar.DAY_OF_MONTH, 1);//设为1

		for (int i = 0; i < c.get(Calendar.DAY_OF_WEEK) - 1; i++) {//防止当月1号不是从周日开始的
			System.out.print("\t");
		}

		for (int i = 1; i <= days; i++) {
			if (day == c.get(Calendar.DAY_OF_MONTH)) {
				System.out.print(c.get(Calendar.DAY_OF_MONTH) + "*\t");//当天后面加*
			} else {
				System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
			}
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {// 周六就换行
				System.out.println();
			}

			c.add(Calendar.DAY_OF_MONTH, 1);
		}

	}

}
