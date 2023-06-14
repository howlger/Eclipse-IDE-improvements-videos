package com.example;
class Sample {

	double y;

	void alignVertically(double y) {
		this.y = y;
	}

	void init(Point p) {
		alignVertically(0);
	}

	/**
	 * <p>Returns the header</p>
	 * <p>
	 * The header includes the title.
	 * </p>
	 */
	String getHeader(String title) {
		StringBuilder templateBuilder = new StringBuilder();
		templateBuilder.append(" ______________________\n|\n");
		templateBuilder.append("| {title}\n");
		templateBuilder.append("|\n");
		String template = templateBuilder.toString();
		return template.replace("{title}", title);
	}

	public static void main(String[] args) {
		String title = "Hello Eclipse IDE 2023-06";
		System.out.println(new Sample().getHeader(title));
	}

}