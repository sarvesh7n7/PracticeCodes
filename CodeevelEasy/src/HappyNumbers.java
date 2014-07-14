import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;


public class HappyNumbers {
	public static void main(String args[]){
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{	
				boolean isHappy = true;
				HashSet<Integer> loopSet = new HashSet<Integer>();
				int num = Integer.valueOf(line);
				int digitSquareSum = 0;
				while(num != 1)
				{
					loopSet.add(num);
					digitSquareSum = 0;
					while(num >0)
					{
						digitSquareSum = digitSquareSum + (num%10)*(num%10);
						num = num/10;
					}
					
					if(digitSquareSum == 1)
					{
						isHappy = true;	
					}
					num = digitSquareSum;
					
					if(loopSet.contains(num))
					{
						isHappy = false;
						break;
					}					
				}
				
				if(isHappy)
					System.out.println("1");
				else System.out.println("0");
					
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
