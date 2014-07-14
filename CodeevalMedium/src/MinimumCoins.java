import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MinimumCoins {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				int totalCount =0;
				int number = Integer.parseInt(line);
				
				totalCount = number/5;
				number = number%5;
				if(number == 0)
				{
					System.out.println(totalCount);
					continue;
				}
				totalCount += number/3;
				number = number%3;
				if(number == 0)
				{
					System.out.println(totalCount);
					continue;
				}
				
				totalCount += number;
				System.out.println(totalCount);
				
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
