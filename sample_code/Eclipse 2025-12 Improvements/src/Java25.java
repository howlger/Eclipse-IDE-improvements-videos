import java.util.Date;
import java.util.Random;

// JEP 511: Module Import Declarations


public class Java25 extends Random {
	String name;
	Date creationDate;

	Java25(String name, long seed) {
		super(seed);
		if (name == null) throw new IllegalArgumentException();
		this.name = name;

		// JEP 513: Flexible Constructor Bodies
	}

	Java25(String name, long seed, Date creationDate) {
		this(name, seed);
		this.creationDate = creationDate;

		// JEP 513: Flexible Constructor Bodies
	}

}