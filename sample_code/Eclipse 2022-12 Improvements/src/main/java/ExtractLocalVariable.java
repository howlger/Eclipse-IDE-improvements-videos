class ExtractLocalVariable {

	

	String normalize(String s) {

		if (s == null || s.strip().length() < 3) {
			return null;
		}

		if (s.strip().length() == 3) {
			return s.strip().toUpperCase();
		}

		return s.strip();
	}

}
