package cn.fwh.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ���ӻ��������򣨰汾����
 * 
 * @author Administrator
 *
 */

public class TestCalendar3 {
	public static void main(String[] args) throws ParseException {
		System.out.println("���������ڣ�����ʽ��2019-02-28��");
		Scanner scanner = new Scanner(System.in);//��������
		String str = scanner.nextLine();
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");//���ڸ�ʽ
		Date date = df.parse(str);// �ַ������ʱ��
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		int day = c.get(Calendar.DATE);
		int days = c.getActualMaximum(Calendar.DATE);

		
		//����һ�з��ܼ�
		System.out.println("��\tһ\t��\t��\t��\t��\t��");

		c.set(Calendar.DAY_OF_MONTH, 1);//��Ϊ1

		for (int i = 0; i < c.get(Calendar.DAY_OF_WEEK) - 1; i++) {//��ֹ����1�Ų��Ǵ����տ�ʼ��
			System.out.print("\t");
		}

		for (int i = 1; i <= days; i++) {
			if (day == c.get(Calendar.DAY_OF_MONTH)) {
				System.out.print(c.get(Calendar.DAY_OF_MONTH) + "*\t");//��������*
			} else {
				System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
			}
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {// �����ͻ���
				System.out.println();
			}

			c.add(Calendar.DAY_OF_MONTH, 1);
		}

	}

}
