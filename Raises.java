import java.util.Scanner;//reading file input
import java.io.*; //reads in everything from .io (including files reading/writing)
import java.text.DecimalFormat;//formatting decimals

public class Raises{

	public static void main(String[] args) throws IOException{//throws IOException claus for file not there errors JVM will terminate if File not found
		
		//Objects
		File inputFile = new File("salaries.txt");//creates file object arg("") <-file name
		Scanner readFile = new Scanner(inputFile);//arg (file obj)
		DecimalFormat df = new DecimalFormat("$###,##0.00"); //ex: 7234 -> $7,234.00 | .85 -> $0.85
		
		PrintWriter outputFile = new PrintWriter("NewPay.txt"); //creates the NewPay.txt file | will overwrite if NewPay.txt already exists
		
		while(readFile.hasNext())//.hasNext() returns true as long as there is more in the file
		{
			double tempPay = readFile.nextDouble(); //inputs from the read file
			System.out.println("Old Pay: " + df.format(tempPay));
			tempPay *= 1.1;	//apply a 10% raise
			System.out.println("New Pay: " + df.format(tempPay));
			outputFile.println(df.format(tempPay)); //outputs to the out file
		}
		
		readFile.close(); //to close the input file
		outputFile.close(); //to close the output file, if you don't then it won't save the file contents
	}
}//end of Raises.java