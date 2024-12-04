import java.util.Collection;

class SampleCleanUps {

	boolean invert(boolean condition) {
		if (condition == true) {
			return false;
		} else {
			return true;
		}
	}

	void printPwd(String pwd) {
		pwd.chars().forEach(s -> System.out.print('*'));
	}

	void visualizeSize(Collection<?> collection) {
		int position;
		for (Object obj : collection) {
			System.out.print('|');
		}
	}

}