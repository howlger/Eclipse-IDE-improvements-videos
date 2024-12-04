import java.util.Collection;

class Sample {

	void printPwd(String pwd) {
		pwd.chars().forEach(s -> System.out.print('*'));
	}

	void visualizeSize(Collection<?> collection) {
		for (Object obj : collection) {
			System.out.print('|');
		}
	}

}
