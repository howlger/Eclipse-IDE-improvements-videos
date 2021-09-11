public class Node {

	private final String name;

	public Node next;

	public Node(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
