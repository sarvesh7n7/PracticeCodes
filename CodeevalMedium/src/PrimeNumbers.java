import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class PrimeNumbers {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			ArrayList<Integer> myList = new ArrayList<Integer>();
			
			while((line = br.readLine()) != null)
			{
				int number = Integer.valueOf(line);
				
				if(number<2)
				{
					System.out.println("0");
					continue;		
				}
				
				System.out.print("2");
							
				int k=0;
				int i = 2;
				while(k<myList.size() && (i=myList.get(k))<number)
				{
					System.out.print(","+i);
					k++;
				}
			//	System.out.print("i= "+i);
				i++;
				
				for(; i<number;i++)
				{				
					boolean isPrime = true;	
					int listcounter = 0;
					for(int j = 2; j<=(int)Math.sqrt(i);j = myList.get(listcounter++))
					{
						if(i%j == 0)
						{
							isPrime = false;
							break;
						}
					}
					if(isPrime)
					{
						myList.add(i);
						System.out.print(","+i);
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
