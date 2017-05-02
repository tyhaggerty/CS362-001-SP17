package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {

		 TimeTable table = new TimeTable();
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
		 LinkedList<Appt> apptList = new LinkedList<Appt>();
		 apptList.push(appt1);
		 apptList.push(appt2);
		 apptList.push(appt3);

		 table.deleteAppt(apptList, appt2);
	 }

	@Test
	public void test02()  throws Throwable  {

		TimeTable table = new TimeTable();
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
		Appt appt1 = new Appt(-1,
				-1 ,
				-1 ,
				-1 ,
				-1 ,
				title,
				description);

		Appt appt2 = null;

		Appt appt3 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		LinkedList<Appt> apptList = null;
		assertNull(table.deleteAppt(apptList, appt1));

		apptList = new LinkedList<Appt>();
		table.deleteAppt(apptList, appt1);

		table.deleteAppt(apptList, appt3);

	}

	@Test
	public void test03()  throws Throwable  {

		TimeTable table = new TimeTable();

		GregorianCalendar gCal_1 = new GregorianCalendar(2017, 10, 10);
		GregorianCalendar gCal_2 = new GregorianCalendar(2017, 11, 11);

		int startHour=13;
		int startMinute=30;
		int startDay=28;
		int startMonth=10;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
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
		LinkedList<Appt> apptList = new LinkedList<Appt>();
		apptList.push(appt1);
		apptList.push(appt2);
		apptList.push(appt3);

		LinkedList<CalDay> calList = new LinkedList<CalDay>();
		calList = table.getApptRange(apptList, gCal_1, gCal_2);
		LinkedList<CalDay> calList_check = calList;
		assertEquals(calList, calList_check);
	}
}
