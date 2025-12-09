import java.util.Optional;

public class Sample {

	int i;

	public Sample() {
		var api = new NewApi();

		var f = api.f;
		api.m(f);
		new NewApi.Nested();

		@SuppressWarnings("deprecation")
		var g = api.f;

	}

	static Optional<Integer> sample(String str) {
		return Optional.of(str).map(s -> s.strip()).filter(x -> !x.isBlank()).map(t -> t.length());
	}

}