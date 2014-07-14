import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class RightMostChar {
	public static void main(String args[]){
		BufferedReader br = null;
		//Scanner input = null;
		try {
			//input = new Scanner(new File("input.txt"));
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;

			while((line = br.readLine()) != null)
			{	
				if(line.isEmpty())	
					continue;
				
				String[] parts = line.split(",");		
				char toCompare = parts[1].charAt(0);
				int i=0;
				for(i =parts[0].length()-1; i>=0; i--)
				{
					if(toCompare == parts[0].charAt(i))
						break;
				}
				System.out.println(i);
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
