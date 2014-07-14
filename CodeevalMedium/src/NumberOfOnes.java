import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NumberOfOnes {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String binaryString = Integer.toBinaryString(Integer.parseInt(line));
				int numCount=0;	
				for(int i =0; i< binaryString.length(); i++)
				{
					if(binaryString.charAt(i) == '1')
						numCount++;
				}
				System.out.println(numCount);
	/*			int num = Integer.parseInt(line);
				int numCount=0;	
				while(num >0)
				{
					if(num%2 == 1)
						numCount++;
					num=num/2;
				}
				System.out.println(numCount);*/
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
