import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ArrayAbsturdity {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split(";");
				
				int arraySize = Integer.valueOf(parts[0]);
				String[] ipArray = parts[1].split(",");
				int repetedNumber  = arraySize-1;
				
				for(int i=0; i<arraySize;i++)
					repetedNumber = repetedNumber ^ i ^ Integer.valueOf(ipArray[i]);
			
					
				System.out.println(repetedNumber);
				
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
