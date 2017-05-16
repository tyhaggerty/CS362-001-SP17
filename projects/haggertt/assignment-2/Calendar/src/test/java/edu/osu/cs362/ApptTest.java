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
	  public void test001()  throws Throwable  {
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
	public void test002()  throws Throwable  {
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
	public void test003()  throws Throwable  {
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
	public void test004()  throws Throwable  {
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

	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		Appt appt0 = new Appt(0, 0, 11, 11, 45, " at ", " at ");
		String string0 = appt0.toString();
		assertEquals("\t11/11/45 at 12:0am , at ,  at \n", string0);
		assertNotNull(string0);
	}

	@Test(timeout = 4000)
	public void test01()  throws Throwable  {
		Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
		appt0.setStartDay(31);
		assertEquals(31, appt0.getStartDay());
	}

	@Test(timeout = 4000)
	public void test02()  throws Throwable  {
		Appt appt0 = new Appt((-2581), (-2581), (-2581), (-2581), (-2581), "", "z?Q9>Aang=MJNp>S@&");
		boolean boolean0 = appt0.getValid();
		assertEquals(-2581, appt0.getStartYear());
		assertEquals(-2581, appt0.getStartHour());
		assertEquals("", appt0.getTitle());
		assertEquals(-2581, appt0.getStartMonth());
		assertFalse(boolean0);
		assertEquals("z?Q9>Aang=MJNp>S@&", appt0.getDescription());
		assertEquals(-2581, appt0.getStartDay());
		assertEquals(-2581, appt0.getStartMinute());
	}

	@Test(timeout = 4000)
	public void test03()  throws Throwable  {
		Appt appt0 = new Appt(7, 7, 7, 7, 7, "", "");
		appt0.getTitle();
		assertEquals(7, appt0.getStartYear());
		assertEquals(7, appt0.getStartHour());
		assertTrue(appt0.getValid());
		assertEquals(7, appt0.getStartMonth());
		assertEquals(7, appt0.getStartDay());
		assertEquals(7, appt0.getStartMinute());
	}

	@Test(timeout = 4000)
	public void test04()  throws Throwable  {
		Appt appt0 = new Appt((-1014), (-1984), 11, 0, 45, "", "");
		int int0 = appt0.getStartMonth();
		assertEquals(0, int0);
		assertEquals(45, appt0.getStartYear());
		assertEquals(11, appt0.getStartDay());
		assertFalse(appt0.getValid());
		assertEquals(-1984, appt0.getStartMinute());
		assertEquals(-1014, appt0.getStartHour());
	}

	@Test(timeout = 4000)
	public void test05()  throws Throwable  {
		Appt appt0 = new Appt(0, (-904), 547, (-904), (-904), "vO5", "vO5");
		int int0 = appt0.getStartMonth();
		assertEquals("vO5", appt0.getDescription());
		assertEquals(0, appt0.getStartHour());
		assertFalse(appt0.getValid());
		assertEquals("vO5", appt0.getTitle());
		assertEquals(-904, appt0.getStartMinute());
		assertEquals(-904, appt0.getStartYear());
		assertEquals((-904), int0);
		assertEquals(547, appt0.getStartDay());
	}

	@Test(timeout = 4000)
	public void test06()  throws Throwable  {
		Appt appt0 = new Appt(23, 59, (-148), (-2143), 0, "V`2+", "V`2+");
		int int0 = appt0.getStartMinute();
		assertEquals(-2143, appt0.getStartMonth());
		assertEquals(23, appt0.getStartHour());
		assertEquals(-148, appt0.getStartDay());
		assertEquals("V`2+", appt0.getTitle());
		assertEquals("V`2+", appt0.getDescription());
		assertEquals(59, int0);
		assertEquals(0, appt0.getStartYear());
		assertFalse(appt0.getValid());
	}

	@Test(timeout = 4000)
	public void test07()  throws Throwable  {
		Appt appt0 = new Appt((-2163), (-2163), (-2163), (-2163), 109, "f _>`LgBd", ")");
		int int0 = appt0.getStartMinute();
		assertEquals(109, appt0.getStartYear());
		assertEquals(-2163, appt0.getStartMonth());
		assertEquals("f _>`LgBd", appt0.getTitle());
		assertEquals(-2163, appt0.getStartDay());
		assertEquals((-2163), int0);
		assertEquals(-2163, appt0.getStartHour());
		assertFalse(appt0.getValid());
		assertEquals(")", appt0.getDescription());
	}

	@Test(timeout = 4000)
	public void test08()  throws Throwable  {
		Appt appt0 = new Appt((-73), 1995, (-73), 1995, (-73), "FLay>_Qnf>~Pi)0k", "InvalidXGCRepresentation");
		int int0 = appt0.getStartHour();
		assertEquals(1995, appt0.getStartMonth());
		assertEquals(1995, appt0.getStartMinute());
		assertEquals("FLay>_Qnf>~Pi)0k", appt0.getTitle());
		assertEquals(-73, appt0.getStartDay());
		assertFalse(appt0.getValid());
		assertEquals("InvalidXGCRepresentation", appt0.getDescription());
		assertEquals((-73), int0);
		assertEquals(-73, appt0.getStartYear());
	}

	@Test(timeout = 4000)
	public void test09()  throws Throwable  {
		Appt appt0 = new Appt(0, 0, 0, 0, 0, (String) null, "U:uTP<A&nM6K");
		int int0 = appt0.getStartDay();
		assertFalse(appt0.getValid());
		assertEquals(0, appt0.getStartMinute());
		assertEquals(0, appt0.getStartMonth());
		assertEquals("U:uTP<A&nM6K", appt0.getDescription());
		assertEquals("", appt0.getTitle());
		assertEquals(0, appt0.getStartYear());
		assertEquals(0, appt0.getStartHour());
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test10()  throws Throwable  {
		Appt appt0 = new Appt(0, (-904), 547, (-904), (-904), "vO5", "vO5");
		assertEquals(547, appt0.getStartDay());

		appt0.setStartDay((-904));
		int int0 = appt0.getStartDay();
		assertEquals((-904), int0);
	}

	@Test(timeout = 4000)
	public void test11()  throws Throwable  {
		Appt appt0 = new Appt(7, 7, 7, 7, 7, "", "");
		appt0.getDescription();
		assertTrue(appt0.getValid());
		assertEquals(7, appt0.getStartMonth());
		assertEquals(7, appt0.getStartYear());
		assertEquals(7, appt0.getStartHour());
		assertEquals(7, appt0.getStartDay());
		assertEquals(7, appt0.getStartMinute());
	}

	@Test(timeout = 4000)
	public void test21()  throws Throwable  {
		Appt appt0 = new Appt(0, 0, 11, 11, 45, " at ", " at ");
		String string0 = appt0.getDescription();
		assertEquals(" at ", appt0.getTitle());
		assertEquals(0, appt0.getStartMinute());
		assertTrue(appt0.getValid());
		assertEquals(45, appt0.getStartYear());
		assertEquals(11, appt0.getStartMonth());
		assertEquals(0, appt0.getStartHour());
		assertEquals(11, appt0.getStartDay());
		assertEquals(" at ", string0);
	}

	@Test(timeout = 4000)
	public void test22()  throws Throwable  {
		Appt appt0 = new Appt(0, 0, 11, 11, 45, " at ", " at ");
		int int0 = appt0.getStartMonth();
		assertTrue(appt0.getValid());
		assertEquals(0, appt0.getStartHour());
		assertEquals(" at ", appt0.getDescription());
		assertEquals(11, int0);
		assertEquals(11, appt0.getStartDay());
		assertEquals(" at ", appt0.getTitle());
		assertEquals(0, appt0.getStartMinute());
		assertEquals(45, appt0.getStartYear());
	}

	@Test(timeout = 4000)
	public void test23()  throws Throwable  {
		Appt appt0 = new Appt(12, 12, 12, 12, 12, "", "");
		String string0 = appt0.toString();
		assertEquals("\t12/12/12 at 12:12pm ,, \n", string0);
		assertNotNull(string0);
	}

	@Test(timeout = 4000)
	public void test24()  throws Throwable  {
		Appt appt0 = new Appt((-1560), 59, 0, 59, 77, "--%M-%D%z", "--%M-%D%z");
		assertEquals("--%M-%D%z", appt0.getTitle());

		appt0.setTitle((String) null);
		assertEquals(0, appt0.getStartDay());
	}

	@Test(timeout = 4000)
	public void test25()  throws Throwable  {
		Appt appt0 = new Appt(4, 4, 441, 441, 441, "l(", "l(");
		assertEquals(441, appt0.getStartDay());

		appt0.setStartDay(4);
		assertEquals(441, appt0.getStartYear());
	}

	@Test(timeout = 4000)
	public void test26()  throws Throwable  {
		Appt appt0 = new Appt(0, 12, 12, (-1), 0, "ffAfhH?", "ffAfhH?");
		int int0 = appt0.getStartYear();
		assertEquals(0, int0);
		assertEquals("ffAfhH?", appt0.getTitle());
		assertFalse(appt0.getValid());
		assertEquals(0, appt0.getStartHour());
		assertEquals(12, appt0.getStartDay());
		assertEquals(-1, appt0.getStartMonth());
		assertEquals("ffAfhH?", appt0.getDescription());
		assertEquals(12, appt0.getStartMinute());
	}

	@Test(timeout = 4000)
	public void test27()  throws Throwable  {
		Appt appt0 = new Appt(0, 0, 2530, 12, (-2013), "", "");
		int int0 = appt0.getStartYear();
		assertEquals((-2013), int0);
		assertEquals(12, appt0.getStartMonth());
		assertEquals(0, appt0.getStartMinute());
		assertFalse(appt0.getValid());
		assertEquals(0, appt0.getStartHour());
		assertEquals(2530, appt0.getStartDay());
	}

	@Test(timeout = 4000)
	public void test28()  throws Throwable  {
		Appt appt0 = new Appt(23, 59, (-148), (-2143), 0, "V`2+", "V`2+");
		String string0 = appt0.toString();
		assertNull(string0);
		assertEquals(59, appt0.getStartMinute());
		assertEquals(-2143, appt0.getStartMonth());
		assertEquals(23, appt0.getStartHour());
		assertEquals("V`2+", appt0.getDescription());
		assertEquals(-148, appt0.getStartDay());
		assertEquals(0, appt0.getStartYear());
		assertEquals("V`2+", appt0.getTitle());
	}

	@Test(timeout = 4000)
	public void test29()  throws Throwable  {
		Appt appt0 = new Appt(0, 1526, 0, 0, 0, ";9x|J<#o8R`", ";9x|J<#o8R`");
		assertEquals(0, appt0.getStartHour());
		assertEquals(0, appt0.getStartYear());
		assertFalse(appt0.getValid());
		assertEquals(";9x|J<#o8R`", appt0.getDescription());
		assertEquals(0, appt0.getStartMonth());
		assertEquals(";9x|J<#o8R`", appt0.getTitle());
		assertEquals(1526, appt0.getStartMinute());
		assertEquals(0, appt0.getStartDay());
	}

	@Test(timeout = 4000)
	public void test30()  throws Throwable  {
		Appt appt0 = new Appt(45, 0, (-840), 0, 11, "\t11/23/45 at 12:0am , at ,  at \n", "\t11/23/45 at 12:0am , at ,  at \n");
		int int0 = appt0.getStartHour();
		assertEquals("\t11/23/45 at 12:0am , at ,  at \n", appt0.getTitle());
		assertEquals(0, appt0.getStartMonth());
		assertEquals(0, appt0.getStartMinute());
		assertFalse(appt0.getValid());
		assertEquals(45, int0);
		assertEquals(-840, appt0.getStartDay());
		assertEquals(11, appt0.getStartYear());
		assertEquals("\t11/23/45 at 12:0am , at ,  at \n", appt0.getDescription());
	}

	@Test(timeout = 4000)
	public void test31()  throws Throwable  {
		Appt appt0 = new Appt(0, 0, 11, 11, 45, " at ", " at ");
		appt0.setStartMinute(0);
		assertEquals(0, appt0.getStartHour());
		assertEquals(11, appt0.getStartDay());
		assertTrue(appt0.getValid());
		assertEquals(45, appt0.getStartYear());
		assertEquals(0, appt0.getStartMinute());
		assertEquals(11, appt0.getStartMonth());
		assertEquals(" at ", appt0.getTitle());
		assertEquals(" at ", appt0.getDescription());
	}

	@Test(timeout = 4000)
	public void test32()  throws Throwable  {
		Appt appt0 = new Appt(0, 0, 11, 11, 45, " at ", " at ");
		assertEquals(45, appt0.getStartYear());

		appt0.setStartYear(0);
		assertTrue(appt0.getValid());
	}

	@Test(timeout = 4000)
	public void test33()  throws Throwable  {
		Appt appt0 = new Appt((-1560), 59, 0, 59, 77, "--%M-%D%z", "--%M-%D%z");
		appt0.setStartHour((-1560));
		assertEquals(59, appt0.getStartMinute());
		assertEquals(59, appt0.getStartMonth());
		assertEquals("--%M-%D%z", appt0.getTitle());
		assertEquals(77, appt0.getStartYear());
		assertEquals(0, appt0.getStartDay());
		assertEquals(-1560, appt0.getStartHour());
		assertEquals("--%M-%D%z", appt0.getDescription());
		assertFalse(appt0.getValid());
	}

	@Test(timeout = 4000)
	public void test34()  throws Throwable  {
		Appt appt0 = new Appt(0, (-904), 547, (-904), (-904), "vO5", "vO5");
		appt0.setStartMonth(45);
		assertEquals(45, appt0.getStartMonth());
	}

	@Test(timeout = 4000)
	public void test35()  throws Throwable  {
		Appt appt0 = new Appt(11, 11, 1, 11, 11, "%Y-%M%z", "");
		String string0 = appt0.toString();
		assertNotNull(string0);
		assertEquals("\t11/1/11 at 11:11am ,%Y-%M%z, \n", string0);
	}
}

