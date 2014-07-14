import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DetectingCycles {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split("\\s");
				int[] array = new int[parts.length];
				boolean isCyclePresent = false;
				for(int i = 0; i<parts.length; i++ )
					array[i] = Integer.valueOf(parts[i]);
				int slowPointer = 0;
				int fastPointer = 0;
				int cycleLength = 0;
				for(int i=0; i<array.length-1;i++)
				{
					slowPointer++;
					fastPointer+=2;
					if(fastPointer>=array.length)
						fastPointer =0;
					if(array[slowPointer] == array[fastPointer])
					{
						if(slowPointer>fastPointer)
							cycleLength = (slowPointer-fastPointer)/2;
						else
							cycleLength = fastPointer-slowPointer;
						while(fastPointer<array.length && slowPointer<array.length)
						{
							if(array[slowPointer] == array[fastPointer])
							{
								isCyclePresent = true;
							}
							else
							{
								isCyclePresent = false;
								break;
							}
							slowPointer++;
							fastPointer++;
						}
						
						if(isCyclePresent)
							break;
					}
				}
				for(int i=parts.length-cycleLength; i<parts.length; i++ )
					System.out.print(array[i]+" ");
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
