package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import java.util.*;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;


/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1;
    /**
     * Generate Random Tests that tests CalDay Class.
     *//*
	@Test
	public void radnomtest()  throws Throwable  {

			 long startTime = Calendar.getInstance().getTimeInMillis();
			 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


			 System.out.println("Start testing...");

			 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				 long randomseed =10;//System.currentTimeMillis();
				 //			System.out.println(" Seed:"+randomseed );
				 Random random = new Random(randomseed);

				 GregorianCalendar gCal = new GregorianCalendar();
				 CalDay cal = new CalDay(gCal);

				 int startHour = ValuesGenerator.getRandomIntBetween(random, 1, 24);
				 int startMinute = ValuesGenerator.getRandomIntBetween(random,0, 59);
				 int startDay = ValuesGenerator.getRandomIntBetween(random,1, 31);
				 int startMonth = ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear = 2017;
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

				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 if((iteration%10000)==0 && iteration!=0 )
					 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

			 }


			 System.out.println("Done testing...");
		 
	 }

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


	*/
}
