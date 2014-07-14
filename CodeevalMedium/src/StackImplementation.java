import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;


public class StackImplementation {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				Stack<String> myStack = new Stack<String>();
				
				String[] parts = line.split("\\s");
				for(int i=0; i<parts.length; i++)
					myStack.push(parts[i]);
				
				while(!myStack.empty())
				{		
					System.out.print(myStack.pop()+" ");
					if(myStack.empty())
						break;
					myStack.pop();		
				}
				System.out.println();
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
