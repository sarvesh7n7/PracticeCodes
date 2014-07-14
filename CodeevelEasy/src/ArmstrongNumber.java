import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ArmstrongNumber {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				int num = Integer.valueOf(line);
				int numLength = line.length();
				int aNum = 0;
				while(num>0)
				{
					int digit = num%10;
					num = num/10;
					aNum = (int) (aNum + Math.pow(digit, numLength));
				}
				

				/*for(int i=0; i<numLength; i++)
				{
					aNum = (int) (aNum + Math.pow(((int)line.charAt(i) - 48),numLength));
				}
*/				if(aNum == Integer.valueOf(line))
					System.out.println("True");
				else
					System.out.println("False");
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
