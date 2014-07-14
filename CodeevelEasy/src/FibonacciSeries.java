import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FibonacciSeries {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				int num = Integer.valueOf(line);
				int previousFib = 0;
				int currentFib = 1;
				int tempfib = 0;
				if(num == 0)
					System.out.println("0");
				else if(num == 1)
					System.out.println("1");
				else
				{
					for(int i = 2; i <= num;i++)
					{
						tempfib = previousFib+currentFib;
						previousFib = currentFib;
						currentFib = tempfib;
					}
					System.out.println(currentFib);
				}			
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
