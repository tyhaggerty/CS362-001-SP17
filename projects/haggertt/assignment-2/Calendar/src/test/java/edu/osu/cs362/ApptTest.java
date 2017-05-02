package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	@Test
	public void test02()  throws Throwable  {
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

		 appt.setStartHour(14);
		 appt.setStartMinute(31);
		 appt.setStartDay(11);
		 appt.setStartMonth(05);
		 appt.setStartYear(2018);
		 appt.setTitle("Test Title");
		 appt.setDescription("Test Description");

		 assertTrue(appt.getValid());
		 assertEquals(14, appt.getStartHour());
		 assertEquals(31, appt.getStartMinute());
		 assertEquals(11, appt.getStartDay());
		 assertEquals(05, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Test Title", appt.getTitle());
		 assertEquals("Test Description", appt.getDescription());
		 appt.toString();
	 }

	@Test
	public void test03()  throws Throwable  {
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

		assertFalse(appt.getValid());
		appt.setStartHour(0);
		assertFalse(appt.getValid());
		appt.setStartMinute(31);
		assertFalse(appt.getValid());
		appt.setStartDay(11);
		assertFalse(appt.getValid());
		appt.setStartMonth(05);
		assertTrue(appt.getValid());
	}

	@Test
	public void test04()  throws Throwable  {
		int startHour=-1;
		int startMinute=-1;
		int startDay=-1;
		int startMonth=-1;
		int startYear=2017;
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				null,
				null);

		assertFalse(appt.getValid());
		appt.setStartHour(0);
		assertFalse(appt.getValid());
		appt.setStartMinute(31);
		assertFalse(appt.getValid());
		appt.setStartDay(11);
		assertFalse(appt.getValid());
		appt.setStartMonth(05);
		assertTrue(appt.getValid());
	}

}
