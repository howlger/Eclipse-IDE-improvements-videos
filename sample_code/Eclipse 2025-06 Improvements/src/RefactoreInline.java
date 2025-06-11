class RefactoreInline {

	void sample() {
		new Thread(() -> inlineMe()).start();
		new Thread(this::inlineMe).start();
	}

	void inlineMe() {
		System.out.println("...");
		// ...
	}

}