class Client {
	void printNodeChain(Node root) {

		var log = new StringBuffer();
		Sample.sample(root, log, null);
		System.out.println(log);

	}
}