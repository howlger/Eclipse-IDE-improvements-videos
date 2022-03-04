package com.example.samples;

import static com.example.samples.HtmlUtil.escapeHtml;

import java.io.PrintStream;

public class Html {

	private static final String TEMPLATE = "<!DOCTYPE html>\n"
			+ "<html lang=\"en\">\n"
			+ "<head>\n"
			+ "  <title>${title}</title>\n"
			+ "</head>\n"
			+ "<body>\n"
			+ "  <h1>${title}</h1>\n"
			+ "  <p>${content}</p>\n"
			+ "</body>"
			+ "</html>";

	public void write(PrintStream out, String title, String content) {
		var resolved =
				TEMPLATE.replace("${title}",   escapeHtml(title))
				        .replace("${content}", escapeHtml(content));
		out.print(resolved);
	}

}