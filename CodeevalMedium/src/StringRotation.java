import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StringRotation {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split(",");
				String firstString = parts[0];
				String secondString = parts[1];
				firstString = firstString+firstString;
				  if( parts[0].length() != parts[1].length())
					    System.out.println("False");
				  
				  else if( firstString.contains(secondString))
					  System.out.println("True");
				  else
					  System.out.println("False");
				
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
