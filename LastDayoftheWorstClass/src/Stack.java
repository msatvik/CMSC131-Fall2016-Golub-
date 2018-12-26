import java.util.ArrayList;

public class Stack<T> {
	private ArrayList<T> myList;

	public Stack() {
		myList = new ArrayList<T>();
	}

	public void push(T element) {
		myList.add(element);
	}

	public T pop() {
		int pos = myList.size() - 1;
		T element = myList.remove(pos);
		return element;
	}

	public boolean isEmpty() {
		return myList.isEmpty();
	}

	public static void main(String[] ar) {
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(2);
		myStack.push(3);
		myStack.push(5);
		myStack.push(7);
		myStack.push(11);
		myStack.push(13);
	}
	
}

