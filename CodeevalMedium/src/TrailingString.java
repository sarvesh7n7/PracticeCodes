import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TrailingString {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				//System.out.println(line);
				String[] parts = line.split(",");
				String firstString = parts[0];
				String trailingString = parts[1];
				boolean isTrailing = true;
				int j=firstString.length()-1;
				for(int i=trailingString.length()-1; i>=0; i--)
				{
					if(j<0)
					{
						isTrailing = false;
						break;
					}
					if(firstString.charAt(j) != trailingString.charAt(i))
					{
						isTrailing = false;
						break;
					}
					
					j--;
				
				}
				
				if(isTrailing)
					System.out.println("1");
				else 
					System.out.println("0");
				
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
