package net.tinvention.training.jse.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

class AssumptionTest {

	@Test
	void testOnlyOnCiServer() {
		assumeTrue("CI".equals(System.getenv("ENV")));
		// remainder of test
	}
	@Test
	void testOnlyOnDeveloperWorkstation() {
		assumeTrue("DEV".equals(System.getenv("ENV")), () -> "Aborting test: not on developer workstation");
		// remainder of test
	}
	@Test
	void testInAllEnvironments() {
		//assumingThat Execute the supplied Executable, but only if the supplied assumption is valid.
		assumingThat("CI".equals(System.getenv("ENV")), () -> {			
			assertEquals(2, 2); // perform these assertions only on the CI server
		});		
		assertEquals("a string", "a string"); // perform these assertions in all environments
	}

}
