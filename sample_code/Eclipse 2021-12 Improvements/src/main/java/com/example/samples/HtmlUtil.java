package com.example.samples;

public class HtmlUtil {

	public static String escapeHtml(String text) {
		return text.replace("<", "&lt;");
	}

}
