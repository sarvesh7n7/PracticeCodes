import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class fizzbuzz {
	
	public void fblogic(int A, int B, int N)
	{
		for(int i =1; i <= N; i++)
		{
			String output = "" ;

			if(i%A == 0 || i%B ==0)
			{
				if(i%A == 0)
					output = output+"F";
				if(i%B == 0)
					output = output+"B";
			}
			else
				output = output+Integer.toString(i);
			System.out.print(output+" ");
		} 
		System.out.println();
	}
	public static void main(String args[]){
		
	    try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			String line = null;
			 while((line = br.readLine()) != null)
			 {
				 String[] parts = line.split("\\s");
				 int A = Integer.valueOf(parts[0]);
				 int B = Integer.valueOf(parts[1]);
				 int N = Integer.valueOf(parts[2]);
				 
				 if(A>20 || B>20 || N<20 || N>100 )
					 System.out.println("boundary voilated.");
				 else
					 new fizzbuzz().fblogic(A,B,N);			 
			 }
				 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
	}
}
