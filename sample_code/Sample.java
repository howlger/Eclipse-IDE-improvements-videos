class Sample {
	static StringBuffer sample(Node root) {

		// New Quick Fix (Ctrl+1): Convert while to do/while
		Node current = root;
		boolean hasNext = true;
		int length = 0;
		while (hasNext) {
			length++;
			if (current.next == null) {
				hasNext = false;
			} else {
				current = current.next;
			}
		}

		// Paste: (root: " + root + ")
		System.out.println("Done.");
		// ... vs. Raw Paste:
		System.out.println("Done.");

		// New performance clean-up: Use StringBuilder instead of StringBuffer 
		StringBuffer nodes = new StringBuffer("Nodes:");
		nodes.append(' ').append(current);
		nodes.append(" (").append(length).append(")");
		return nodes;

	}

	StringBuffer sampleField;
}