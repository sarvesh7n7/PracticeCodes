import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SimpleSort {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split("\\s");
				Double[] arrayTosort = new Double[parts.length];
				for(int i=0;i<parts.length;i++)
				{
					arrayTosort[i] = Double.valueOf(parts[i]);
				}
				Arrays.sort(arrayTosort);
				
				for(int i=0;i<arrayTosort.length;i++)
				{
					if(i ==  arrayTosort.length-1)
						System.out.print(arrayTosort[i]);
					else
						System.out.print(arrayTosort[i]+" ");
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
