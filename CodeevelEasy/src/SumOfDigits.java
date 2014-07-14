import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SumOfDigits {
	public static void main(String args[]){
	BufferedReader br = null;
	try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				int num = Integer.valueOf(line);
				int sum = 0;
				while(num>0)
				{
					sum = sum+num%10;
					num =num/10;
				}
				System.out.println(sum);
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


