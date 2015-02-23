package net.sourceforge.ext4j.log.log4j;

import static org.junit.Assert.*;

import org.apache.log4j.helpers.PatternParser;
import org.junit.Test;

public class ExtraPatternLayoutTest {

	@Test
	public void createPatternParser() throws Exception {
		ExtrasPatternLayout oLayout = new ExtrasPatternLayout();
		PatternParser oActual = oLayout.createPatternParser("%s");
		assertEquals(ExtrasPatternParser.class.getName(), oActual.getClass().getName());

		oLayout = new ExtrasPatternLayout("%s");
		oActual = oLayout.createPatternParser("%s");
		assertEquals(ExtrasPatternParser.class.getName(), oActual.getClass().getName());
	}

}
