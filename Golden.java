//program to calculate the Fibonacci numbers of a user specified number
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Golden
{
	public static void main(String[] args)
	{
		//variables
		Scanner ins = new Scanner(System.in);
		int number = 0;
		//declare array
		// int[] fiboNumbers = new int[10];
		// double[] goldenR = new double[10];
		double[][] fibo = new double[2][10];
		
		//initialise first two fiboNumbers, remember fiboNumbers are in first row
		fibo[0][0] = 0;//row 1, item 1
		fibo[0][1] = 1;//row 1, item 2
		
		//calculate fiboNumbers for the first row
		for(int index = 2; index < fibo[0].length; index++)
		{
			fibo[0][index] = fibo[0][index - 1] + fibo[0][index - 2];
		}//end for that creates range
		
		
		
		//calculate ratio's between consecutive fibo numbers (second row)
		for(int index = 0; index < fibo[1].length; index++)
		{
			try
			{
				fibo[1][index] = fibo[0][index + 1] / fibo[0][index];
			}//end try
			catch(ArrayIndexOutOfBoundsException e)
			{
				fibo[1][index] = 0.0;
			}
		}//end for that creates golden ratio array
		
		//display first row
		System.out.printf("%10s", "Index");
		for(int indx = 0; indx < fibo[0].length; indx++)
			System.out.printf("%6d", indx);
		System.out.printf("\n%10s", "F-Number");
		for(int indx = 0; indx < fibo[0].length; indx++)
			System.out.printf("%6.0f", fibo[0][indx]);
		System.out.printf("\n%10s", "Ratio's");
		for(int indx = 0; indx < fibo[1].length; indx++)
			System.out.printf("%6.3f", fibo[1][indx]);
		
		// creating an object of class Numbers and send it using overloaded method
		Numbers myObj = new Numbers(fibo);		
		//output via toString method
		System.out.println("\n\n" + myObj);
	}
}