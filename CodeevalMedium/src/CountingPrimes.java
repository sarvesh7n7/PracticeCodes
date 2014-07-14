import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CountingPrimes {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split(",");
				int lowerLimit = Integer.parseInt(parts[0]);
				int upperLimit = Integer.parseInt(parts[1]);
				int primeCount = 0;
				
				for(int i= lowerLimit; i<=upperLimit; i++)
				{
					boolean isPrime = true;
					for(int j=2; j<= (int)Math.sqrt(i); j++)
					{
						if(i%j == 0)
							isPrime = false;		
					}
					if(isPrime)
						primeCount++;
				}
				System.out.println(primeCount);
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
