/**
 * 
 */
package com.autoStock.analysis.results;

import java.util.Date;

/**
 * @author Kevin Kowalewski
 *
 */
public class ResultsAverageDirectionalIndex extends ResultsBase {
	
	public Date[] arrayOfDates;
	public double[] arrayOfADX;
	public float[] arrayOfPrice;
	
	public ResultsAverageDirectionalIndex(int length){
		this.arrayOfDates = new Date[length];
		this.arrayOfADX = new double[length];
		this.arrayOfPrice = new float[length];
	}
}