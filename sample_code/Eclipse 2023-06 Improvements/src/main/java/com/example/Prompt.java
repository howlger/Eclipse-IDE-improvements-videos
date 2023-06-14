package com.example;
class Prompt {

	String getPrompt() {
		StringBuilder promptBuilder = new StringBuilder();
		promptBuilder.append("\nWelcome!\n");
		promptBuilder.append("\n");
		promptBuilder.append("Your name: ");
		String prompt = promptBuilder.toString();
		return prompt;
	}

}
