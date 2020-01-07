package net.tinvention.training.jse.junit;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A special test case")
class StandardTest {
	
	@BeforeAll
	static void initAll() {	}

	@BeforeEach
	void init() { }

	@Test
	@DisplayName("A special test")
	void succeedingTest() { }

	@Test
	void failingTest() {
		fail("a failing test");
	}

	@Test
	@Disabled("this test is disabled")
	void skippedTest() { /* not executed */ }

	@AfterEach
	void tearDown() { }

	@AfterAll
	static void tearDownAll() { }
}
