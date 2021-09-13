class Sample {
	static String sample(Node root, StringBuffer log, String id) {

		// Fixed: Eclipse bug 574913
		if (root == null) {
			  // <- no templates in Eclipse 2021-06
			System.out.println();
		} else {
			  // <- no proposals for "root." here in Eclipse 2021-06
			System.out.println();
		}

		// Raw Paste:

	System.getenv().entrySet().forEach(entry -> {
		System.out.println(entry.getKey() + ": " + entry.getValue());
	});		// vs. Paste:
		// Copy: " (id: " + id + ")"
		System.out.println("Starting..."); // Raw Paste
		System.out.println("Starting..."); // vs. Paste

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

		// New performance clean-up: Use StringBuilder instead of StringBuffer
		StringBuffer nodes = new StringBuffer("Nodes:");
		nodes.append(' ').append(current);
		log.append("-> ").append(length);
		return nodes.toString();

	}

	StringBuffer sampleField;
}