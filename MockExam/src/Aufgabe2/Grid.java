package Aufgabe2;

public class Grid {
	
	public static void main(String[] args) {
		Node n00 = new Node(null, null);
		Node n01 = new Node(null, null);
		n00.setRight(n01);
		Node n10 = new Node(null, null);
		n00.setBottom(n10);
		Node n11 = new Node(null, null);
		
		n01.setBottom(n11);
		n10.setRight(n11);
		
		Grid.adjustGrid(n00, 3, 2);
		System.out.println("Executed main for Grid");
	}
	
	public static void adjustGrid(Node origin, int A, int B) {
		//this is basically just constructing a new grid of size A x B (A rows and B columns)
		//getRight and getDown return null if there are no new nodes in the thing
	}

}
