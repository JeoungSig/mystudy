/**
 * 2014 TaxCalculatorTest.java Licensed to Steven J.S Min. For use this source code, you must have to get right from the author. Unless enforcement is
 * prohibited by applicable law, you may not modify, decompile, or reverse engineer Software.
 */
package com.common.tax;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Steven J.S Min
 * 
 */
@RunWith(Parameterized.class)
public class TaxCalculatorTest {

	private static TaxCalculator calculator;
	private double revenue;
	private int year;
	private double expectedTax;

	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { 
				{ 0.00, 2006, 0.00 }, 
				{ 10000.00, 2006, 1950.00 }, 
				{ 20000.00, 2006, 3900.00 }, 
				{ 38000.00, 2006, 7410.00 }, 
				{ 38001.00, 2006, 7411.00 },
				{ 40000.00, 2006, 8070.00 }, 
				{ 60000.00, 2006, 14670.00 }, 
				{ 100000.00, 2006, 30270.00 } 
		});
	}

	public TaxCalculatorTest(double revenue, int year, double expectedTax) {
		this.revenue = revenue;
		this.year = year;
		this.expectedTax = expectedTax;
	}

	@BeforeClass
	public static void initObject() {
		calculator = new TaxCalculatorImpl();
	}

	@Test
	public void testCalculateIncomeTax() {
		double calculatedTax = this.calculator.calculateIncomeTax(year, revenue);
		Assert.assertEquals(expectedTax, calculatedTax, 0.00);
	}

}
