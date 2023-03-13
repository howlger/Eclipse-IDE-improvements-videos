public class BytecodeSample {

	public static void main(String[] args) {
		var cmd= "";
		for (String current : args) {
			cmd+= current + " ";
		}
		System.out.println(cmd);
	}

}