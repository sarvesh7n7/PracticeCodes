import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ClosestMultiple {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split(",");
				int X = Integer.parseInt(parts[0]);
				int N = Integer.parseInt(parts[1]);
				int newN = N;
				int i=2;
				while(newN<X)
				{
					newN=N*i;
					i++;
				}
				System.out.println(newN);
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
