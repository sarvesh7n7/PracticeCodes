import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReverseGroup {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input1.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split(";");
				
				int reverseLength = Integer.valueOf(parts[1]);
				String[] numbers = parts[0].split(",");
				String temp = null;
				int arrayOffset = 0;
				while(true)
				{
					int start = arrayOffset;
					int end = arrayOffset+reverseLength-1;
					if(end > numbers.length-1)
						break;
					while(start<=end)
					{
						temp = numbers[start];
						numbers[start] = numbers[end];
						numbers[end] = temp;
						start++;
						end--;
					}
					arrayOffset += reverseLength;
				}
				System.out.print(numbers[0]);
				for(int i =1; i<numbers.length; i++)
					System.out.print(","+numbers[i]);
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
