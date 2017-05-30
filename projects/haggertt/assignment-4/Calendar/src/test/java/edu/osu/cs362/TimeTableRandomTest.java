package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import java.util.*;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {

	private static final long TestTimeout = 60 * 500 * 1;

    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {


		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");

		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed = 10;//System.currentTimeMillis();
			 //			System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);


			 TimeTable table = new TimeTable();
			 GregorianCalendar gCal = new GregorianCalendar();
			 CalDay cal = new CalDay(gCal);
			 int startHour = ValuesGenerator.getRandomIntBetween(random, 1, 24);
			 int startMinute = ValuesGenerator.getRandomIntBetween(random, 0, 59);
			 int startDay = ValuesGenerator.getRandomIntBetween(random, 1, 31);
			 int startMonth = ValuesGenerator.getRandomIntBetween(random, 1, 12);
			 int startYear = 2017;
			 String title = "Birthday Party";
			 String description = "This is my birthday party.";
			 //Construct a new Appointment object with the initial data
			 Appt appt1 = new Appt(startHour,
					 startMinute,
					 startDay,
					 startMonth,
					 startYear,
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
			 LinkedList<Appt> apptList = new LinkedList<Appt>();
			 apptList.push(appt1);
			 apptList.push(appt2);
			 apptList.push(appt3);

			 table.deleteAppt(apptList, appt2);

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if((iteration%10000)==0 && iteration!=0 )
				 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);


		 }

		 long randomseed = 10;//System.currentTimeMillis();
		 //			System.out.println(" Seed:"+randomseed );
		 Random random = new Random(randomseed);

		 TimeTable table = new TimeTable();
		 table.deleteAppt(null, null);

		 int startHour = ValuesGenerator.getRandomIntBetween(random, 1, 24);
		 int startMinute = ValuesGenerator.getRandomIntBetween(random, 0, 59);
		 int startDay = ValuesGenerator.getRandomIntBetween(random, 1, 31);
		 int startMonth = ValuesGenerator.getRandomIntBetween(random, 1, 12);
		 int startYear = 2017;

		 Appt appt1 = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 "test",
				 "test");

		 Appt appt2 = new Appt(-1,
				 -1,
				 -1,
				 -1,
				 -1,
				 "test",
		 		"test");

		 Appt appt3 = new Appt(1,
				 1,
				 1,
				 1,
				 1,
				 "test",
				 "test");

		 LinkedList<Appt> apptList = new LinkedList<Appt>();
		 apptList.push(appt1);

		 table.deleteAppt(apptList, null);

		 table.deleteAppt(null, appt1);
		 table.deleteAppt(apptList, appt2);

		 LinkedList<Appt> apptList2 = new LinkedList<Appt>();
		 apptList2.push(appt1);
		 table.deleteAppt(apptList, appt3);

	 }


	
}
