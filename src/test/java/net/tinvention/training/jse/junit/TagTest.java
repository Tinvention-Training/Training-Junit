package net.tinvention.training.jse.junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("order")
@Tag("billing")
class TagTest {
	
	@Test
	@Tag("taxes")
	void testingTaxes() {	}
}
