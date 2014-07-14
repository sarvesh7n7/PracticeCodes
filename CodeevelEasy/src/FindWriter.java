import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FindWriter {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				if(line.isEmpty())
					continue;
				String[] parts = line.split("\\|");
				String encoded = parts[0];
				String[] codes = parts[1].split("\\s");
				char[] writerName = new char[codes.length-1];
				for(int i =1; i<codes.length; i++)
				{
					writerName[i-1] = encoded.charAt(Integer.valueOf(codes[i])-1);
							 
				}
				String output = new String(writerName);
				System.out.println(output);				
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
