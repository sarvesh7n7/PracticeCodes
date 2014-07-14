import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DistancePoints {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			
			while((line = br.readLine()) != null)
			{
				//logic to extract the points.
				Pattern p = Pattern.compile("-?\\d+");
				Matcher m = p.matcher(line);
				
				m.find();
				int X1 = Integer.parseInt(m.group());
				m.find();
				int Y1 = Integer.parseInt(m.group());
				m.find();
				int X2 =Integer.parseInt(m.group());
				m.find();
				int Y2 = Integer.parseInt(m.group());
			
				int distance = (int)Math.sqrt(Math.pow((X1-X2),2)+Math.pow((Y1-Y2),2));
				System.out.println(distance);
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
