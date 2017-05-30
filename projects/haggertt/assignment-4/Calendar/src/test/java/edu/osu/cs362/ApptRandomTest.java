package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setDescription"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
    /**
     * Generate Random Tests that tests Appt Class.
     */
/*	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =10;//System.currentTimeMillis();
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
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
				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
	 
	 
		 System.out.println("Done testing...");
	 }
*/
/*
	@Test
	public void test000()  throws Throwable  {

		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		System.out.println("Start testing...");


		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			long randomseed =10;//System.currentTimeMillis();
			//			System.out.println(" Seed:"+randomseed );
			Random random = new Random(randomseed);

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
			for (int i = 0; i < NUM_TESTS; i++) {
				String methodName = ApptRandomTest.RandomSelectMethod(random);
				if (methodName.equals("setDescription")){
					String newTitle=(String) ValuesGenerator.getString(random);
					appt.setDescription(newTitle);
				}

			}

			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if((iteration%10000)==0 && iteration!=0 )
				System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		}


		System.out.println("Done testing...");
	}

	@Test
	public void radnomIsValid()  throws Throwable {

		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		System.out.println("Start testing...");


		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			long randomseed =10;//System.currentTimeMillis();
			//			System.out.println(" Seed:"+randomseed );
			Random random = new Random(randomseed);

			int startHour = ValuesGenerator.getRandomIntBetween(random, -10, 50);
			int startMinute = ValuesGenerator.getRandomIntBetween(random,-5, 65);
			int startDay = ValuesGenerator.getRandomIntBetween(random,-5, 35);
			int startMonth = ValuesGenerator.getRandomIntBetween(random, -10, 20);
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

			//appt.isValid();

			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if((iteration%10000)==0 && iteration!=0 )
				System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		}

		System.out.println("Done testing...");
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
		Appt appt0 = new Appt(5, 5, 700, 700, 700, "", "");
		assertEquals(700, appt0.getStartYear());
		assertEquals(5, appt0.getStartHour());
		assertFalse(appt0.getValid());
		assertEquals(700, appt0.getStartMonth());
		assertEquals(700, appt0.getStartDay());
		assertEquals(5, appt0.getStartMinute());
	}

	@Test(timeout = 4000)
	public void test04()  throws Throwable  {
		Appt appt0 = new Appt(5, 5, 5, 700, 5, "", "");
		assertEquals(700, appt0.getStartMonth());
		assertEquals(5, appt0.getStartYear());
		assertEquals(5, appt0.getStartDay());
		assertEquals(5, appt0.getStartMinute());
		assertEquals(5, appt0.getStartHour());
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
		Appt appt0 = new Appt(23, 66, (-148), (-2143), 0, "V`2+", "V`2+");
		int int0 = appt0.getStartMinute();
		assertEquals(-2143, appt0.getStartMonth());
		assertEquals(23, appt0.getStartHour());
		assertEquals(-148, appt0.getStartDay());
		assertEquals("V`2+", appt0.getTitle());
		assertEquals("V`2+", appt0.getDescription());
		assertEquals(66, int0);
		assertEquals(0, appt0.getStartYear());
		assertFalse(appt0.getValid());
	}

	@Test(timeout = 4000)
	public void test07()  throws Throwable  {
		Appt appt0 = new Appt((-2163), (-2163), (2163), (-2163), 109, "f _>`LgBd", ")");
		int int0 = appt0.getStartMinute();
		assertEquals(109, appt0.getStartYear());
		assertEquals(-2163, appt0.getStartMonth());
		assertEquals("f _>`LgBd", appt0.getTitle());
		assertEquals(2163, appt0.getStartDay());
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
	}*/
}
