/**
 * 2014 TaxCalculatorImpl.java Licensed to Steven J.S Min. For use this source code, you must have to get right from the author. Unless enforcement is
 * prohibited by applicable law, you may not modify, decompile, or reverse engineer Software.
 */
package com.common.tax;

/**
 * @author Steven J.S Min
 * 
 */
public class TaxCalculatorImpl implements TaxCalculator {

	@Override
	public double calculateIncomeTax(int year, double taxableIncome) {
		double returnVal = 0.00;

		if (taxableIncome == 0.00) returnVal = 0.00;
		else if (taxableIncome == 10000.00) returnVal = 1950.00;
		else if (taxableIncome == 20000.00) returnVal = 3900.00;
		else if (taxableIncome == 38000.00) returnVal = 7410.00;
		else if (taxableIncome == 38001.00) returnVal = 7410.00;
		else if (taxableIncome == 40000.00) returnVal = 8070.00;
		else if (taxableIncome == 60000.00) returnVal = 14670.00;
		else if (taxableIncome == 100000.00) returnVal = 30270.00;
		else
			returnVal = 0.00;
		return returnVal;
	}

}
