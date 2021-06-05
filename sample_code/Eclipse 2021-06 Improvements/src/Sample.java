public class Sample {
	
	int[] values = {0, 0};
	
	boolean isSameDimension(Sample other) {
		return values.length == other.values.length;
	}
	
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.values = new int[] {42};
		if (sample.isSameDimension(new Sample())) {
			// ...
		}
	}

}