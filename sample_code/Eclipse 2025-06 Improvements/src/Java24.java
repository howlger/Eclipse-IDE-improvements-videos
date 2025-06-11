import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

class Java24 {
	public static void main(String[] args) throws NoSuchAlgorithmException {

		// JEP 485: Stream Gatherers
		// * To build efficient, parallel-ready streams
		//   that implement almost any intermediate operation
		// * Stream::gather(Gatherer) is to intermediate operations what
		//   Stream::collect(Collector) is to terminal operations
		var groupsOfMaxThree = Stream.of("a", "b", "c", "d", "e")
				.gather(Gatherers.windowFixed(3))
				.toList();
		// > [[a, b, c], [d, e]]
		System.out.println(groupsOfMaxThree);

		// JEP 484: Class-File API
		// * Parse
		// * Generate
		// * Transform

		// JEP 496: Quantum-Resistant Module-Lattice-Based Key Encapsulation Mechanism
		KeyPairGenerator.getInstance("ML-KEM");

		// JEP 497: Quantum-Resistant Module-Lattice-Based Digital Signature Algorithm
		KeyPairGenerator.getInstance("ML-DSA");

		// ...

	}
}
