import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class OverlappingRectangles {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] coordinates = line.split(",");
				int x1ofA = 0;
				int x2ofA = 0;
				int y1ofA = 0;
				int y2ofA = 0;
				int x1ofB = 0;
				int x2ofB = 0;
				int y1ofB = 0;
				int y2ofB = 0;
				
				{
					x1ofA = Integer.valueOf(coordinates[0]);
					y1ofA = Integer.valueOf(coordinates[1]);
					x2ofA = Integer.valueOf(coordinates[2]);
					y2ofA = Integer.valueOf(coordinates[3]);
					x1ofB = Integer.valueOf(coordinates[4]);
					y1ofB = Integer.valueOf(coordinates[5]);
					x2ofB = Integer.valueOf(coordinates[6]);
					y2ofB = Integer.valueOf(coordinates[7]);
				}
				
				 if (x1ofA > x2ofB || x1ofB > x2ofA)
				 {
				        System.out.println("False");
				        continue;
				 }
				 if (y1ofA < y2ofB || y1ofB < y2ofA)
				 {
					  System.out.println("False");
				        continue;
				 }
				 System.out.println("True");
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
