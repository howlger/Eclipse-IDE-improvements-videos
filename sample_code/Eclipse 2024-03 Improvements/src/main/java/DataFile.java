import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class DataFile {

	int headerLength= 2;

	void read(String fileName) throws IOException {
		var in = new FileInputStream(fileName);
		try (in) {
			skipHeader(in);
			// do useful stuff with `in`
		}
	}

	void skipHeader(InputStream in) throws IOException {
		in.readNBytes(headerLength);
	}

}