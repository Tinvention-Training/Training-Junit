package net.tinvention.training.jse.junit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParametrizedTest {

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	// @ValueSource works also with other primitive types and with:
	// java.lang.String, java.lang.Class
	void testWithValueSource(int argument) {
		assertTrue(argument > 0 && argument < 4);
	}

	@ParameterizedTest
	// @EnumSource takes values from java enum
	@EnumSource(value = TimeUnit.class) // NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS
	// @EnumSource(value = TimeUnit.class, names = { "DAYS", "HOURS" })
	// @EnumSource(value = TimeUnit.class, mode = Mode.EXCLUDE, names = { "DAYS", "HOURS" })
	void testWithEnumSource(TimeUnit timeUnit) {
		assertNotNull(timeUnit);
	}
	
	@DisplayName("This is the special CSV Test")
	@ParameterizedTest(name = "{index} ==> firstParam=''{0}'', secondParam={1}")
	@CsvSource({ "one, 1", "two, 2", "three, 3" })
	void testWithCustomDisplayNames(String firstParam, int secondParam) {
		
	}

}
