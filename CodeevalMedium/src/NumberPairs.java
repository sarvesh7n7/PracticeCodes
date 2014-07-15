import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NumberPairs {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split(";");
				int requiredSum = Integer.valueOf(parts[1]);
				String[] numberList = parts[0].split(",");
				int startIndex = 0;
				int endIndex = numberList.length-1;
				boolean isSumFound = false;
				boolean isFirst = true;
				while(startIndex<endIndex)
				{
					int frontElement = Integer.valueOf(numberList[startIndex]);
					int rearElement = Integer.valueOf(numberList[endIndex]);
					if(requiredSum < frontElement+rearElement)
					{
						endIndex--;
					}
					if(requiredSum > frontElement+rearElement)
					{
						startIndex++;
					}
					if(requiredSum == frontElement+rearElement)
					{
						if(isFirst)
						{
							isFirst = false;
							System.out.print(frontElement+","+rearElement);
						}
						else
							System.out.print(";"+frontElement+","+rearElement);
						isSumFound = true;
						startIndex++;
						endIndex--;			
					}
				}
				if(!isSumFound)
					System.out.println("NULL");
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
