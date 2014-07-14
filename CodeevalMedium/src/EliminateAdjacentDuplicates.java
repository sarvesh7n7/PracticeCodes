import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;


public class EliminateAdjacentDuplicates {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input1.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				char[] ipString= line.toCharArray();
				int length = line.length();	
				int i=0;
				Stack<Character> myStack = new Stack<Character>();
				while(i<length)
				{
					/*if(ipString[i] == ipString[i+1])
					{
						for(int j=i+2; j<length;j++)
						{
							ipString[j-2] = ipString[j];
						}
						length = length-2;
						i--;
						if(i<0)
							i++;
					}
					else
						i++;		*/	
					if(!myStack.empty() && myStack.peek() == ipString[i])
						{
							myStack.pop();
						}
					else
						myStack.push(ipString[i]);
					i++;
					
				}
				System.out.println(myStack);
				for(int j=0; j<length; j++)
				{
					System.out.print(ipString[j]);
				}
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
