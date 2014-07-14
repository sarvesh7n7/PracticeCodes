import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class DoubleSquares {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input1.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				int number = Integer.parseInt(line);
				int doubleSquareCount = 0;
				int loopLimit = (int)Math.sqrt(number);
		
				for (int i = 0; i <= loopLimit; i++)
				{
					int newnum = number - i*i;
				    double j = Math.sqrt(newnum);
				    System.out.println(j+"  "+(int) j);
				    if (j - (int)j == 0.0)  
				    	doubleSquareCount++;  
				}
				
				System.out.println(doubleSquareCount);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
