// class to calculate the position of golden ratio

public class Numbers
{
	// declaration of instance variables
	private int goldenRatio ;
	
	// default constructor
	public Numbers()
	{
		goldenRatio = 0;
	}// end of default constructor
	
	// overloaded constructor
	public Numbers(double[][] theNumbers)
	{
		setGoldenRatioNumber(theNumbers);
	}// end of overloaded constructor
	
	// method to determine position of golden ratio
	private void setGoldenRatioNumber(double[][] array)
	{
		final double GOLD = 1.61803398;// constant variable representing golden ratio
		double placeHolder = 0;
		boolean flag = false;// flag to check whether the place is found
		int k;// declaration of control variable to use within whole method
		
		// for loop to determine position
		for(k = 0; k < array[1].length && !flag; k++)
		{				
			// if to check whether position was found
			if(Math.abs(GOLD - array[1][k]) <= 0.01)
			{
				flag = true;				
			}// end of if
		}// end of for loop
		// set goldenRatio to k value which is the position
		goldenRatio = k;
	}
	
	// toString method to return value of goldenRatio and adjusted message
	public String toString()
	{
		String message = String.format("The golden ratio position is: " + goldenRatio);
		return message;
	}// end of toString method

}
