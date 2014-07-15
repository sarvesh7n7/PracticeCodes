public class IntegerStackLinkedList {
	Node top = null;

	boolean push(int data) {
		try {
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = top;
			top = newNode;
		} catch (OutOfMemoryError e) {
			System.out.println("Failed to push into Stack, Out Of Memory!");
			return false;
		}
		return true;
	}

	Node pop() {
		if (top == null) {
			System.out.println("Stack is empty!");
			return null;
		} else {
			Node ptr = top;
			top = top.next;
			return ptr;
		}
	}

	void printStack() {
		if (top == null) {
			System.out.println("Stack is empty, failed to Print!");
		} else {
			Node temp = top;
			System.out.print("top->[");
			while (temp != null) {
				System.out.print(temp.data + ", ");
				temp = temp.next;
			}
			System.out.print("]->bottom\n");
		}
	}

	public static void main(String[] args) {
		/*
		 * Sequence to execute: Push 5 Push 8 Pop pop pop Push 56 push 65 push
		 * 45 pop.
		 */
		IntegerStackLinkedList stack = new IntegerStackLinkedList();

		stack.push(5);
		stack.push(8);

		Node temp = stack.pop();
		if (temp != null)
			System.out.println("Popped=" + temp.data);

		temp = stack.pop();
		if (temp != null)
			System.out.println("Popped=" + temp.data);

		temp = stack.pop();
		if (temp != null)
			System.out.println("Popped=" + temp.data);

		stack.push(56);
		stack.push(65);
		stack.push(45);

		temp = stack.pop();
		if (temp != null)
			System.out.println("Popped=" + temp.data);

		System.out.println("\nPrinting the Stack Content:");
		stack.printStack();

	}

	class Node {
		int data;
		Node next = null;
	}
}
