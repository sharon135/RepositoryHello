package com.gxr.com.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateUtil {
	private static TimeZone localTimeZone;
	private static String newTimeZone = "Etc/GMT0";
	static {
//		localTimeZone = TimeZone.getDefault();
//		TimeZone.setDefault(TimeZone.getTimeZone(newTimeZone));
	}

	/**
	 * 对日期(时间)中的日进行加减计算. <br>
	 * 例子: <br>
	 * 如果Date类型的d为 2005年8月20日,那么 <br>
	 * calculateByDate(d,-10)的值为2005年8月10日 <br>
	 * 而calculateByDate(d,+10)的值为2005年8月30日 <br>
	 * 
	 * @param d
	 *            日期(时间).
	 * @param amount
	 *            加减计算的幅度.+n=加n天;-n=减n天.
	 * @return 计算后的日期(时间).
	 */
	public static Date calculateByDate(Date d, int amount) {
		return calculate(d, Calendar.DATE, amount);
	}

	public static Date calculateByHour(Date d, int amount) {
		return calculate(d, Calendar.HOUR, amount);
	}

	public static Date calculateByMinute(Date d, int amount) {
		return calculate(d, Calendar.MINUTE, amount);
	}

	public static Date calculateByYear(Date d, int amount) {
		return calculate(d, Calendar.YEAR, amount);
	}

	/**
	 * 对日期(时间)中由field参数指定的日期成员进行加减计算. <br>
	 * 例子: <br>
	 * 如果Date类型的d为 2005年8月20日,那么 <br>
	 * calculate(d,GregorianCalendar.YEAR,-10)的值为1995年8月20日 <br>
	 * 而calculate(d,GregorianCalendar.YEAR,+10)的值为2015年8月20日 <br>
	 * 
	 * @param d
	 *            日期(时间).
	 * @param field
	 *            日期成员. <br>
	 *            日期成员主要有: <br>
	 *            年:GregorianCalendar.YEAR <br>
	 *            月:GregorianCalendar.MONTH <br>
	 *            日:GregorianCalendar.DATE <br>
	 *            时:GregorianCalendar.HOUR <br>
	 *            分:GregorianCalendar.MINUTE <br>
	 *            秒:GregorianCalendar.SECOND <br>
	 *            毫秒:GregorianCalendar.MILLISECOND <br>
	 * @param amount
	 *            加减计算的幅度.+n=加n个由参数field指定的日期成员值;-n=减n个由参数field代表的日期成员值.
	 * @return 计算后的日期(时间).
	 */
	private static Date calculate(Date d, int field, int amount) {
		if (d == null) {
			return null;
		}
		GregorianCalendar g = new GregorianCalendar();
		g.setGregorianChange(d);
		g.add(field, amount);
		return g.getTime();
	}

	/**
	 * 将日期时间字符串根据转换为指定时区的日期时间.
	 * 
	 * @param srcFormater
	 *            待转化的日期时间的格式.
	 * @param srcDateTime
	 *            待转化的日期时间.
	 * @param dstFormater
	 *            目标的日期时间的格式.
	 * @param dstTimeZoneId
	 *            目标的时区编号.
	 * 
	 * @return 转化后的日期时间.
	 */
	public static String string2Timezone(String srcFormater,
			String srcDateTime, String dstFormater, String dstTimeZoneId) {
		if (srcFormater == null || "".equals(srcFormater)) {
			return null;
		}
		if (srcDateTime == null || "".equals(srcDateTime)) {
			return null;
		}
		if (dstFormater == null || "".equals(dstFormater)) {
			return null;
		}
		if (dstTimeZoneId == null || "".equals(dstTimeZoneId)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(srcFormater);
		try {
			int diffTime = getDiffTimeZoneRawOffset(dstTimeZoneId);
			Date d = sdf.parse(srcDateTime);
			long nowTime = d.getTime();
			long newNowTime = nowTime - diffTime;
			d = new Date(newNowTime);
			return date2String(dstFormater, d);
		} catch (ParseException e) {
			// Log.output(e.toString(), Log);
			return null;
		} finally {
			sdf = null;
		}
	}

	/**
	 * 获取系统当前默认时区与指定时区的时间差.(单位:毫秒)
	 * 
	 * @param timeZoneId
	 *            时区Id
	 * @return 系统当前默认时区与指定时区的时间差.(单位:毫秒)
	 */
	private static int getDiffTimeZoneRawOffset(String timeZoneId) {
		return TimeZone.getDefault().getRawOffset()
				- TimeZone.getTimeZone(timeZoneId).getRawOffset();
	}

	/**
	 * 日期(时间)转化为字符串.
	 * 
	 * @param formater
	 *            日期或时间的格式.
	 * @param aDate
	 *            java.util.Date类的实例.
	 * @return 日期转化后的字符串.
	 */
	public static String date2String(String formater, Date aDate) {
		if (formater == null || "".equals(formater)) {
			return null;
		}
		if (aDate == null) {
			return null;
		}
		return (new SimpleDateFormat(formater)).format(aDate);
	}

	/**
	 * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
	 * 
	 * @param strDate
	 * @return
	 */
	public static Date strToDateLong(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = formatter.parse(strDate, pos);
		return strtodate;
	}
	
	/**
	 * 取得当前时间
	 * @param pattern
	 * @return
	 */
	public static Date getCurrentTime() {
		Date date = Calendar.getInstance().getTime();
//		TimeZone.setDefault(TimeZone.getTimeZone(newTimeZone));
		return date;
	}

	/**
	 * 计算两个时间之间的间隔
	 * @param stDate
	 * @param enDate
	 * @param type
	 * @return
	 */
	public static double getIntervalBetweenTime(Date stDate, Date enDate, int type) throws Exception {
		long interval = 0;
		double ret = 0;
		long div = 0;
		
		if (stDate == null || enDate == null) {
			throw (new Exception("Error parameter!"));
		}
		
		long st = stDate.getTime();
		long en = enDate.getTime();
		
		interval = en - st;
		
		//根据计算类型获得除数
		switch (type) {
		case Calendar.MINUTE:
			div = 1000 * 60;
			break;
		case Calendar.HOUR:
			div = 1000 * 60 * 60;
			break;
		case Calendar.DATE:
			div = 1000 * 60 * 60 * 24;
			break;
		default:
			break;
		}
		
		// 计算时间间隔
		ret = (double)interval / (double)div;
		
		return ret;
	}
	
	public static void main(String args[]) {
		/*String datetime = "2014-12-18 00:00:00";
		DateTimeZone fromZone = DateTimeZone.forID("Etc/GMT0");
		DateTimeZone toZone = DateTimeZone.forID("Asia/Shanghai");
		DateTime daTime = new DateTime(new Date(), fromZone);
		System.out.println(daTime.toDateTime(toZone).toString(
				"yyyy-MM-dd HH:mm:ss"));

		System.out.println(DateUtil.string2Timezone("yyyy-MM-dd HH:mm:ss",
				datetime, "yyyy-MM-dd HH:mm:ss", "Asia/Shanghai"));*/
		
//		System.out.println(DateUtil.getCurrentTime());
//		System.out.println(localTimeZone);
	}
}
