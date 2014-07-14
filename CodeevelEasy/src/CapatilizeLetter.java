import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CapatilizeLetter {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				StringBuilder newString = new StringBuilder(line);
				newString.setCharAt(0, Character.toUpperCase(newString.charAt(0)));
				for(int i=0; i<newString.length();i++)
				{
					if(newString.charAt(i) == ' ')
						newString.setCharAt(i+1, Character.toUpperCase(newString.charAt(i+1)));
				}
				
				System.out.println(newString);
			/*	String[] parts = line.split("\\s");
			//	StringBuilder newString = new StringBuilder(line.length());
				for(int i=0; i<parts.length; i++)
				{
					parts[i] = parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
					
					System.out.print(parts[i]+" ");
				}
				System.out.println();*/
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
