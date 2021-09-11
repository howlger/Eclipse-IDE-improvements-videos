class SampleTest {
	public static void main(String[] args) {

		StringBuffer buffer = Sample.sample(createNodeChain(10));
		System.out.println(buffer);

	}

	static Node createNodeChain(int length) {
		Node root = new Node("Node1");
		Node last = root;
		for (int i = 2; i <= length; i++) {
			Node node = new Node("Node" + i);
			last.next = node;
			last = node;
		}
		return root;
	}
}