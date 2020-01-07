package net.tinvention.training.jse.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {
	
	private Student student = new Student();
	
	@BeforeEach
	void init() {
		student.addMark(1);
		student.addMark(2);
	}

	@Test
	void getGrade() {
		assertEquals(1.5d, student.getGrade(), "marks's average differ");
	}

}
