import java.util.LinkedList;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>oj = new LinkedList<>();
		oj.add(10);
		oj.add(20);
		oj.add(30);
		oj.add(40);
		oj.add(50);
		oj.add(60);
		
		System.out.println(oj);
		oj.addFirst(100);
		System.out.println(oj);
		oj.addLast(200);
		System.out.println(oj);
	}
}
