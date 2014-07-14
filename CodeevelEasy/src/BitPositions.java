import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BitPositions {
public static void main(String args[]){
		
	    try {
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			 while((line = br.readLine()) != null)
			 {
				 String[] parts = line.split(",");
				 int num = Integer.valueOf(parts[0]);
				 int position1 = Integer.valueOf(parts[1]);
				 int position2 = Integer.valueOf(parts[2]);
				 
			
				 int p1 = (num>>(position1-1))&1;
				
				 int p2 = (num>>(position2-1))&1;
				 
				 System.out.println(p1 == p2);
				
			 }
				 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	        
	}

}
