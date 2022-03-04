package com.example.samples;
import java.util.function.Supplier;

public class Greeter {
	interface NameSupplier extends Supplier<String> {}

	void greet(String... args) {
		var message = hello(() -> getFirstIfPresent(args, "world"));
		System.out.println(message);
	}

	String getFirstIfPresent(String[] args, String otherwise) {
		return args.length > 0 ? args[0] : otherwise;
	}
	
	String hello(NameSupplier nameSupplier) {
		return "Hello " + nameSupplier.get();
	}

	String hi(NameSupplier nameSupplier) {
		return "Hi " + nameSupplier.get();
	}

	public static void main(String[] args) throws Exception {
		new Greeter().greet(args);
		Thread.sleep(10_000);
	}

}