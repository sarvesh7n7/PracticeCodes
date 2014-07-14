import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LowestUniqueNumber {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
				
			while((line = br.readLine()) != null)
			{
				String[] parts= line.split("\\s");
				int[] numbers = new int[parts.length];
				
				int[] isRepeted = new int[10];
				for(int i=0; i<parts.length;i++)
				{	
					//numbers[i] = Integer.parseInt(parts[i]);
					isRepeted[Integer.parseInt(parts[i])]+=1;
				}
				
				for(int i=0; i<parts.length;i++)
				{	
					
				}
				boolean isfound = false;
				int min = 0;
				for(int i=1; i<10;i++)
				{
					if(isRepeted[i] == 1)
					{
						min = i;
						isfound = true;
						break;
					}
				}
				
				if(!isfound)
					System.out.println("0");
				else
				{
					for(int i=0; i<parts.length;i++)
					{
						if( min == Integer.parseInt(parts[i]))
						{
							System.out.println(i+1);
							break;
						}
					}	
				}
				
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
