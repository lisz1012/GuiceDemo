package com.lisz;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StudentTest {
	private static Student student;

	@BeforeAll
	public static void setup() {
		Injector injector = Guice.createInjector(new StudentModule());
		student = injector.getInstance(Student.class);
	}

	@Test
	public void testPrintStudent() {
		System.out.println(student);
	}
}
// Student{id=6, name='s1', address=Address{number=300, street='Pike St.'}, school=School{number=1, name='中学'}}