import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SplitNumber {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				int num=0;
				String[] parts = line.split("\\s");
				String number = parts[0];
			
				int splitIndex = parts[1].indexOf('+');
				if(splitIndex == -1)
				{
					splitIndex = parts[1].indexOf('-');
					num = 
							Integer.parseInt(number.substring(0, splitIndex)) -
							Integer.parseInt(number.substring(splitIndex, number.length()));
				}

				else
				{
					num = 
							Integer.parseInt(number.substring(0, splitIndex)) +
							Integer.parseInt(number.substring(splitIndex, number.length()));
				}
					
				System.out.println(num);			
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
