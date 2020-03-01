package java13;

import java.util.List;

public class JavaEditor  {
	
	private static final String LI = " - ";

	void printAll(List<String> list) {
		for (String s : list) {
			System.out.println(LI + s);
		}
	}

}