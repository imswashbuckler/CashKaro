package GLobalLogics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class DateString {

	public static List<String> converDateStr(List<String> dates) {

		List<String> outPut = new ArrayList<String>();
		HashSet<String> Dt = new LinkedHashSet<String>();
		Dt.add("1st");
		Dt.add("2nd");
		Dt.add("3rd");
		Dt.add("4th");
		Dt.add("5th");
		HashSet<String> Mon = new LinkedHashSet<String>();
		Mon.add("Jan");
		Mon.add("Feb");
		Mon.add("Mar");
		Mon.add("Apr");
		Mon.add("May");
		Mon.add("Jun");
		Mon.add("Jul");
		Mon.add("Aug");
		Mon.add("Sep");
		Mon.add("Oct");
		Mon.add("Nov");
		Mon.add("Dec");

		HashSet<String> Yr = new LinkedHashSet<String>();
		Yr.add("1900");
		Yr.add("1901");
		Yr.add("1902");
		Yr.add("1903");
		Yr.add("1904");
		Yr.add("1905");
		Yr.add("1906");
		Yr.add("1907");
		Yr.add("1908");
		Yr.add("1909");
		Yr.add("1910");
		Yr.add("1911");

		for (String str : dates)
		{
			String[] strA = str.split(" ");

			String year = strA[2];
			String month = strA[1];
			String Day = strA[0];
			int yrdt = 1;
			String result = "";
			int mon = 1;
			if (Yr.contains(strA[2]) && Mon.contains(strA[1])	&& Dt.contains(strA[0]))
			{

				for (String stock : Dt) {
					if (stock.equals(strA[0])) {
						break;
					} else {
						yrdt++;

					}
				}

				for (String stock1 : Mon) {
					if (stock1.equals(strA[1])) {
						break;
					} else {
						mon++;

					}
				}

				result = year + "-" + mon + "-" + yrdt;
				outPut.add(result);

			}

		}
		return outPut;
	}

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("3rd May 1911");
		ls.add("5th Aug 1901");
		ls.add("4th Oct 1907");
		ls.add("1st Dec 1909");
		ls.add("2nd Apr 1902");
		ls.add("3rd Nov 1908");
		ls.add("3rd Sep 1911");
		ls.add("5th Nov 1911");

		List<String> op = converDateStr(ls);
		for(String k:op)
		System.out.println(k);
		//System.out.println(op.toString());
	}
}
