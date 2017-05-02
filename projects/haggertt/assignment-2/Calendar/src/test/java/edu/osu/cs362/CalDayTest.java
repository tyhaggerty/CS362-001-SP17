package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		 GregorianCalendar gCal = new GregorianCalendar();
		 CalDay cal = new CalDay(gCal);
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		 cal.addAppt(appt);
		 assertTrue(cal.isValid());
	 }

	@Test
	public void test02()  throws Throwable  {
		GregorianCalendar gCal = new GregorianCalendar();
		CalDay cal = new CalDay(gCal);
		int startHour=25;
		int startMinute=65;
		int startDay=35;
		int startMonth=13;
		int startYear=2017;
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				null,
				null);
		cal.addAppt(appt);
		cal.toString();
	}

	@Test
	public void test03()  throws Throwable  {
		GregorianCalendar gCal = new GregorianCalendar();
		CalDay cal = new CalDay(gCal);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		cal.addAppt(appt);
		assertTrue(cal.isValid());
		cal.getSizeAppts();
		Iterator<?> cal_iter = cal.iterator();
	}

	@Test
	public void test04()  throws Throwable  {
		CalDay cal = new CalDay();
		Iterator<?> cal_iter = cal.iterator();
		cal.toString();
	}

	@Test
	public void test05()  throws Throwable  {
		GregorianCalendar gCal = new GregorianCalendar();
		CalDay cal = new CalDay(gCal);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt1 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		Appt appt2 = new Appt(startHour + 1,
				startMinute + 1,
				startDay + 1,
				startMonth + 1,
				startYear + 1,
				title,
				description);
		Appt appt3 = new Appt(startHour - 1,
				startMinute - 1,
				startDay - 1,
				startMonth - 1,
				startYear - 1,
				title,
				description);
		cal.addAppt(appt1);
		cal.addAppt(appt2);
		cal.addAppt(appt3);
		assertTrue(cal.isValid());
		cal.toString();
	}
}
