package com.stackroute.com.walkinproject;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CandidateJobTest {
	private static Candidate obj = null;

	@BeforeClass
	public static void testBeforeClass() {
		obj = new Candidate();
	}

	@AfterClass
	public static void testAfterClass() {
		obj = null;
	}

	@Before
	public void beforeTest() {
	}

	@After
	public void afterTest() {
	}

	@Test
	public void testApplicableJava() {
		assertEquals("Applicable", obj.newCandidate("Sandeep", "18-08-1997", "Java Developer", 7777777777l, 24, 24, 0));
	}

	@Test
	public void testApplicableNet() {
		assertEquals("Applicable",
				obj.newCandidate("Jagadeesh", "18-08-1997", ".Net Developer", 7777777777l, 24, 24, 0));
	}

	@Test
	public void testApplicableTrainingSupport() {
		assertEquals("Applicable", obj.newCandidate("Ram", "21-07-1997", "Training Support", 1111111111l, 14, 13, 0));
	}

	@Test
	public void testApplicableSrJava() {
		assertEquals("Applicable",
				obj.newCandidate("Rajashekar", "21-09-1996", "Sr. Java Developer", 8888888888l, 75, 100, 2));
	}

	@Test
	public void testApplicableJavaArchitect() {
		assertEquals("Applicable",
				obj.newCandidate("Praveen", "21-10-1999", "Java Architect", 5555555555l, 79, 120, 3));
	}

	@Test
	public void testNotApplicableJava() {
		assertEquals("Not Applicable", obj.newCandidate("Raju", "18-08-1997", ".Net Developer", 7777777776l, 24, 2, 0));
	}

	@Test
	public void testNotApplicableNet() {
		assertEquals("Not Applicable",
				obj.newCandidate("Rakesh", "21-09-1996", "Sr. Java Developer", 8888888881l, 7, 10, 2));
	}

	@Test
	public void testApplicableMessageTrainingSupport() {
		assertEquals("Experience not matched", "Applicable",
				obj.newCandidate("Hemanth", "21-07-1997", "Training Support", 1111111111l, 14, 15, 0));
	}

	@Test
	public void testNotApplicableMessageSrJava() {
		assertEquals("Experience not matched", "Not Applicable",
				obj.newCandidate("Pasha", "21-09-1996", "Sr. Java Developer", 8888888888l, 14, 15, 2));
	}

	@Test
	public void testApplicableJavaUsingNotEquals() {
		assertNotEquals("Not Applicable",
				obj.newCandidate("Bheem", "18-08-1997", "Java Developer", 7777777777l, 24, 24, 0));
	}

	@Test
	public void testApplicableNetUsingNotEquals() {
		assertNotEquals("Not Applicable",
				obj.newCandidate("Sandeep", "18-08-1997", ".Net Developer", 7777777777l, 24, 24, 0));
	}

	@Test
	public void testApplicableTraingSupportUsingNotNull() {
		assertNotNull(obj.newCandidate("Rahul", "21-07-1997", "Training Support", 1111111111l, 14, 13, 0));
	}

	@Test
	public void testApplicableJavaArchitectUsingNotNull() {
		assertNotNull(obj.newCandidate("Praveen", "21-10-1999", "Java Architect", 6666666665l, 79, 120, 3));
	}

	@Test
	public void testApplicableJavaArchitectUsingNotNullMessage() {
		assertNotNull("given null",
				obj.newCandidate("Hemanth", "21-07-1997", "Training Support", 2222222222l, 14, 15, 0));
	}

	@Test
	public void testApplicableJavaArch() {
		assertEquals("Applicable",
				obj.newCandidate("Kranthi", "21-10-1999", "Java Architect", 4444455555l, 79, 120, 3));
	}

	@Test
	public void testNotApplicableJavaDevUsingNotNull() {
		assertNotNull(obj.newCandidate("Nikhil", "18-08-1997", "Java Developer", 2222222233l, 2, 4, 0));
	}

	@Test
	public void testNotApplicableJavaArchUsingNotNull() {
		assertNotNull(obj.newCandidate("Sairam", "21-10-1999", "Java Architect", 4444444444l, 2, 11, 3));
	}

	@Test
	public void testNotApplicableSrNet() {
		assertEquals("Not Applicable",
				obj.newCandidate("Vignan", "18-08-1997", "Sr. .Net Developer", 8888888887l, 2, 24, 0));
	}

	@Test
	public void testNotApplicableSrNetUsingNotEquals() {
		assertNotEquals("Applicable",
				obj.newCandidate("Malik", "18-08-1997", "Sr. .Net Developer", 8888888887l, 122, 124, 0));
	}

	@Test
	public void testApplicableSrJavaUsingNotEquals() {
		assertNotEquals("Not Applicable",
				obj.newCandidate("Vineeth", "18-08-1997", "Sr. Java Developer", 8888888887l, 120, 124, 4));
	}

}