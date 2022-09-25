package com.example;

import java.util.Iterator;
import java.util.List;

class ToEnhancedFor {

	// as in the past ...
	void permutations(String[] strings1, String[] strings2) {
		for (int i = 0; i < strings1.length; i++) {
			String s1 = strings1[i];
			for (int j = 0; j < strings2.length; j++) {
				String s2 = strings2[j];
				System.out.println(s1 + s2);
			}
		}
	}

	// ... now also ...
	void permutations(List<String> strings1, List<String> strings2) {
		Iterator<String> it = strings1.iterator();
		while (it.hasNext()) {
			String s1 = it.next();
			Iterator<String> it2 = strings2.iterator();
			while (it2.hasNext()) {
				String s2 = it2.next();
				System.out.println(s1 + s2);
			}
		}
	}

}