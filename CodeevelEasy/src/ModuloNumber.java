import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ModuloNumber {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split(",");
				int divident = Integer.valueOf(parts[0]);
				int divisor = Integer.valueOf(parts[1]);
				
			//	System.out.println(divident - divisor*(divident/divisor));
				
				int newdivisor = divisor;
				while(newdivisor<divident)
					newdivisor+= divisor;
				System.out.println(divident-(newdivisor-divisor));
		
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
