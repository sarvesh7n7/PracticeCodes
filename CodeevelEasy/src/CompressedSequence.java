import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CompressedSequence {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				
				
				String[] numbers = line.split("\\s");
				int num = Integer.parseInt(numbers[0]);
				int numcount = 1;
				if(numbers.length == 1)
					System.out.print(numcount+" "+num+" ");
				for(int i=1; i<numbers.length; i++)
				{
					int strnum = Integer.parseInt(numbers[i]);
					if(num == strnum)
						numcount++;
					if(num != strnum)
					{
						System.out.print(numcount+" "+num+" ");
						num = Integer.parseInt(numbers[i]);
						numcount =1;
					}
					if(i == numbers.length-1)
					{
						System.out.print(numcount+" "+num+" ");
					}
				
				}
				
				System.out.println();
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
