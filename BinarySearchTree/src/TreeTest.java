
public class TreeTest {
	
	public static void main(String args[]){
		
		Tree myTree = new Tree();
		
		myTree.addData(4);
		myTree.addData(2);
		myTree.addData(1);
		myTree.addData(3);
		myTree.addData(6);
		myTree.addData(5);
		myTree.addData(7);
		
	
		myTree.preOrderNonRecursive();
		System.out.println();
		myTree.preOrderNonRecursive1();
		
		//System.out.println(myTree.hightOfTree());
	}
}
