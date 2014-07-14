import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PointInCircle {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				Pattern p = Pattern.compile("-?\\d+\\.?\\d*");
				Matcher m = p.matcher(line);
				
		
				m.find();
				double centerX = Double.valueOf(m.group()); 
				m.find();
				double centerY = Double.valueOf(m.group()); 
				m.find();
				double radius = Double.valueOf(m.group()); 
				m.find();
				double pointX = Double.valueOf(m.group()); 
				m.find();
				double pointY = Double.valueOf(m.group()); 
				
				double distance = Math.sqrt((Math.pow((centerX-pointX),2) + Math.pow((centerY-pointY), 2)));
				if(distance<= radius) 
					System.out.println(true);
				else
					System.out.println(false);
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
