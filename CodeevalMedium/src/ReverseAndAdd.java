import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReverseAndAdd {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				int digitLength = line.length();
				
				int number = Integer.valueOf(line);
				int iterationCount = 0;
				while(!isPalindrome(Integer.toString(number)))
				{
					int tempNumber = number;
					int reverseNumber = 0;
					while(tempNumber != 0)
					{
						reverseNumber *= 10;
						reverseNumber += tempNumber%10;
						tempNumber /= 10;
					}
					number = number+reverseNumber;
					iterationCount++;
				}
				System.out.println(iterationCount+" "+number);
				
				
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
	
	public static boolean isPalindrome(String input)
	{
		int start =0;
		int end = input.length()-1;
		boolean flag = true;
		while( start <= end)
		{
			if(input.charAt(start) != input.charAt(end))
			{
				flag = false;
				break;
			}
			start++;
			end--;
		}
		
		return flag;
	}
}
