import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWords {
	public static void main(String args[]){
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split("\\s");
				for(int i = parts.length-1; i>=0; i--)
				{
					System.out.print(parts[i]+" ");
				}
				System.out.println();

			} 


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}        

}
